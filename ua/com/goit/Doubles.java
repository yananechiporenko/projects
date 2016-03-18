package ua.com.goit;

import java.math.BigDecimal;

public class Doubles {
    public Double parse(String s) {
        StateMachine automat = new StateMachine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            automat.next(c);
        }
        return automat.getResult();
    }

    private static class StateMachine {
        State correntState = State.INIT;

        public void next(char c) {
            correntState = correntState.next(c, data);
        }
        ParseData data = new ParseData();

        public Double getResult() {
            boolean validExpression = correntState == State.NUMBER ||
                    correntState == State.DECIMAL || correntState == State.E_NUMBER;
            if (validExpression) {
                return data.getNumber();
            }
            return null;
        }

        public enum State {
            INIT {
                @Override
                public State next(char c, ParseData data) {
                    if (c - '0' >= 0 && c - '0' <= 9) {
                        data.addDigit(c - '0');
                        return NUMBER;
                    } else if (c == '-') {
                        data.addSign();
                        return NUMBER;
                    } else if (c == '+') {
                        return NUMBER;
                    } else if (c == '.') {
                        return POINT;
                    }
                    return INVALID_END;
                }
            }, POINT {
                @Override
                public State next(char c, ParseData data) {
                    if (c - '0' >= 0 && c - '0' <= 9) {
                        data.addDecimal(c - '0');
                        return DECIMAL;
                    } else if (c == 'e' || c == 'E') {
                        return E;
                    } else if (c == ' ') return VALID_END;
                    return INVALID_END;
                }
            }, E {
                @Override
                public State next(char c, ParseData data) {
                    if (c == '-') {
                        data.addESign();
                        return E_NUMBER;
                    } else if (c == '+') {
                        return E_NUMBER;
                    } else if (c - '0' >= 0 && c - '0' <= 9) {
                        data.addEDigit(c - '0');
                        return E_NUMBER;
                    } else if (c == ' ') return VALID_END;
                    return INVALID_END;
                }
            },E_NUMBER {
                @Override
                public State next(char c, ParseData data) {
                    if (c - '0' >= 0 && c - '0' <= 9) {
                        data.addEDigit(c - '0');
                        return E_NUMBER;
                    } else if (c == ' ') return VALID_END;
                    return INVALID_END;
                }
            }, DECIMAL {
                @Override
                public State next(char c, ParseData data) {
                    if (c - '0' >= 0 && c - '0' <= 9) {
                        data.addDecimal(c - '0');
                        return DECIMAL;
                    } else if (c == 'e' || c == 'E') {
                        return E;
                    } else if (c == ' ') return VALID_END;
                    return INVALID_END;
                }
            }, NUMBER {
                @Override
                public State next(char c, ParseData data) {
                    if (c - '0' >= 0 && c - '0' <= 9) {
                        data.addDigit(c - '0');
                        return NUMBER;
                    } else if (c == 'e' || c == 'E') {
                        return E;
                    } else if (c == '.') {
                        return DECIMAL;
                    } else if (c == ' ') return VALID_END;
                    return INVALID_END;
                }
            }, VALID_END {
                @Override
                public State next(char c, ParseData data) {
                    if (c == ' ') return VALID_END;
                    return INVALID_END;
                }
            }, INVALID_END {
                @Override
                public State next(char c, ParseData data) {
                    return INVALID_END;
                }
            };

            public abstract State next(char c, ParseData data);
        }
    }

    public static class ParseData {
        private double number = 0.0;
        private double sign = 1.0;
        private double eNumber = 0.0;
        private double eSign = 1.0;
        private BigDecimal decimal = new BigDecimal(0);
        private int counter = 1;

        public void addDigit(int i) {
            number = number * 10 + i;
        }

        public void addSign() {
            sign *= - 1;
        }

        public void addDecimal(int i) {
            BigDecimal shift = new BigDecimal(10);
            final BigDecimal iBigDecimal = new BigDecimal(i);
            shift = shift.pow(counter);
            BigDecimal temp = iBigDecimal.divide(shift);
            decimal = decimal.add(temp);
            counter++;
        }

        public void addEDigit(int i) {
            eNumber = eNumber * 10 + i;
        }

        public void addESign() {
            eSign *= -1;
        }

        public double getNumber() {
            double result = (number + decimal.doubleValue()) * sign;
            if (eNumber != 0) {
                result =result * Math.pow(10.0, (eNumber * eSign));
                return result;
            }
            return result;
        }
    }
}


