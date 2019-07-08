package mangolost.msgqueue.kafkaproducer.controller;

import mangolost.msgqueue.common.helper.CommonResult;
import mangolost.msgqueue.kafkaproducer.service.SendMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/kafka/msgsend")
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
	@RequestMapping("topic")
	public Object sendTopic(String msg, CommonResult commonResult) {
		sendMsgService.sendTopic(msg);
		return commonResult.setData(msg);
	}
}
