package mangolost.msgqueue.rabbitmqproducer.controller;

import mangolost.msgqueue.common.helper.CommonResult;
import mangolost.msgqueue.rabbitmqproducer.service.SendMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/rabbitmq/msgsend")
public class SendMsgController {

	private final SendMsgService sendMsgService;

	@Autowired
	public SendMsgController(SendMsgService sendMsgService) {
		this.sendMsgService = sendMsgService;
	}

	/**
	 * @param msg
	 * @param commonResult
	 * @return
	 */
	@RequestMapping("queue")
	public CommonResult sendQueue(String msg, CommonResult commonResult) {
		sendMsgService.sendQueue(msg);
		return commonResult.setData(msg);
	}
}
