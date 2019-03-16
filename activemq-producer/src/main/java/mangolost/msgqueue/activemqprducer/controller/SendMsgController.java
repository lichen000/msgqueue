package mangolost.msgqueue.activemqprducer.controller;

import mangolost.msgqueue.activemqprducer.service.SendMsgService;
import mangolost.msgqueue.common.helper.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/activemq/msgsend")
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

	/**
	 * @param msg
	 * @param commonResult
	 * @return
	 */
	@RequestMapping("all")
	public Object sendAll(String msg, CommonResult commonResult) {
		sendMsgService.sendAll(msg);
		return commonResult.setData(msg);
	}
}
