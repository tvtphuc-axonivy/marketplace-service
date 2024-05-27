package com.axonivy.market.exceptions;

import static com.axonivy.market.Constants.INVALID_MISSING_HEADER_ERROR_MESSAGE;

public class MissingHeaderException extends Exception {
    public MissingHeaderException() {
        super(INVALID_MISSING_HEADER_ERROR_MESSAGE);
    }
}
