package com.example.SpringExpense.IO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ErrorObject {
    private Integer statusCode;
    private String message;
    private Date timeStamp;
    private  String  errorCode;
}
