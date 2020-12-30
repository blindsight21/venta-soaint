/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soaint.venta.vo;

import java.io.Serializable;

/**
 *
 * @author Omar
 */
public class ManejoErrorJson implements Serializable {

    private String httpStatus;
    private String message;
    private String Code;
    private String BackendMessage;

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getBackendMessage() {
        return BackendMessage;
    }

    public void setBackendMessage(String BackendMessage) {
        this.BackendMessage = BackendMessage;
    }

}
