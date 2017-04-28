package com.kumar.learningrest.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.kumar.learningrest.database.DatabaseClass;
import com.kumar.learningrest.model.Message;

/**
 * @author Saravana Kumar M
 *
 */
public class MessageService
{
	private final Map<Long, Message> messages = DatabaseClass.getMessages();

	public MessageService()
	{
		this.messages.put(1L, new Message(1, "Hello World", "Kumar", LocalDateTime.now()));
		this.messages.put(2L, new Message(2, "Say Hello To Web Services", "Kumar", LocalDateTime.now()));
	}

	public List<Message> getAllMessages()
	{
		return new ArrayList<>(this.messages.values());
	}

	public Message getMessage(final long messageId)
	{
		return this.messages.get(messageId);
	}

	public Message addMessage(final Message message)
	{
		message.setId(this.messages.size() + 1);
		this.messages.put(message.getId(), message);
		return message;
	}

	public Message updateMessage(final Message message)
	{
		if(message.getId() <= 0)
			return null;
		this.messages.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(final long messageId)
	{
		return this.messages.remove(messageId);
	}
}