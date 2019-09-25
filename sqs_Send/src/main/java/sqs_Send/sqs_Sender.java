package sqs_Send;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.AmazonSQSException;
import com.amazonaws.services.sqs.model.CreateQueueResult;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;
import com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.SendMessageRequest;

public class sqs_Sender {
    public static void send(String qURL) {
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
            String queueUrl = qURL;
            SendMessageRequest send_msg_request = new SendMessageRequest()
                    .withQueueUrl(queueUrl)
                    .withMessageBody("Test Send from JAVA")
                    .withDelaySeconds(1);
            sqs.sendMessage(send_msg_request);
    }
}
