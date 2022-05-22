package com.codinativ.springboot.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Philip Niron Nithianandan
 * email - philip.niron@gmail.com
 * LinkedIn - @philip-niron
 * on 22-May-2022 at 17:38
 * @Project StudentCRUD
 * Happy Coding..!
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message){
        super(message);
    }

}
