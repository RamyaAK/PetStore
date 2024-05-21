package petstore_client;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse {
    protected int httpStatusCode;
}