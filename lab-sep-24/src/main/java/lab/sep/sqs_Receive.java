/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab.sep;

import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.AmazonSQSException;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;

public class sqs_Receive {
    List<Message> messages = sqs.receiveMessage(queueUrl).getMessages();

}
