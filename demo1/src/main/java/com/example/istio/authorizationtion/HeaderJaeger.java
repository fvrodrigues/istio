package com.example.istio.authorizationtion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeaderJaeger {

    private List<String> headers = Arrays.asList("x-request-id","x-b3-traceid","x-b3-spanid","x-b3-parentspanid","x-b3-sampled","x-b3-flags","x-ot-span-context");

    public List<String> getHeaders() {
        return headers;
    }

}
