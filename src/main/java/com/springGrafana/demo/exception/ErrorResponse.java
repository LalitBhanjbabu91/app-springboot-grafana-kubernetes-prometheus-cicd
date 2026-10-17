package com.springGrafana.demo.exception;


/**
 * Error response DTO for API errors.
 */
public record ErrorResponse(int status, String message, String details)
{ }

