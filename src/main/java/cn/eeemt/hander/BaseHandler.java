package cn.eeemt.hander;

import cn.eeemt.entity.Result;
import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

/**
 * author: HuangXiquan <br/>
 * date: 2017/10/30/030 <br/>
 * time: 23:50 <br/>
 * description:
 */
@ControllerAdvice
@RestController
public class BaseHandler {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String notFound() {
        return "not found";
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public String requestHandlingNoHandlerFound() {
        return "custom_404";
    }

    @ExceptionHandler(Throwable.class)
    public Result error(Throwable e) {
        return new Result<>(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), null);
    }
}
