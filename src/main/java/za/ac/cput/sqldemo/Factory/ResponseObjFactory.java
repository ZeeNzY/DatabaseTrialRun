package za.ac.cput.sqldemo.Factory;

import za.ac.cput.sqldemo.Domain.ResponseObj;

public class ResponseObjFactory {
    public static ResponseObj buildGenericResponseObj(String responseCode, String responseDescription)
    {
        return new ResponseObj(responseCode, responseDescription);
    }
}
