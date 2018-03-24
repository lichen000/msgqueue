package mangolost.msgqueue.activemq.controller;

import mangolost.msgqueue.common.CommonResult;
import mangolost.msgqueue.common.utils.JsonPUtils;
import mangolost.msgqueue.activemq.service.SendMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/msgsend")
public class SendMsgController {

    @Autowired
    private SendMsgService sendMsgService;

    /**
     *
     * @param msg
     * @param commonResult
     * @param callback
     * @return
     */
    @RequestMapping("queue")
    public Object sendQueue(String msg, CommonResult commonResult, String callback) {

        sendMsgService.sendQueue(msg);

        commonResult.setData(msg);
        return JsonPUtils.doJsonP(commonResult, callback);
    }

    /**
     *
     * @param msg
     * @param commonResult
     * @param callback
     * @return
     */
    @RequestMapping("topic")
    public Object sendTopic(String msg, CommonResult commonResult, String callback) {

        sendMsgService.sendTopic(msg);

        commonResult.setData(msg);
        return JsonPUtils.doJsonP(commonResult, callback);
    }

    /**
     *
     * @param msg
     * @param commonResult
     * @param callback
     * @return
     */
    @RequestMapping("all")
    public Object sendAll(String msg, CommonResult commonResult, String callback) {

        sendMsgService.sendAll(msg);

        commonResult.setData(msg);
        return JsonPUtils.doJsonP(commonResult, callback);
    }
}
