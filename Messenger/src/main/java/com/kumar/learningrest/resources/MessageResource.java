package com.kumar.learningrest.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kumar.learningrest.model.Message;
import com.kumar.learningrest.service.MessageService;

/**
 * @author Saravana Kumar M
 *
 */

@Path("/messages")
public class MessageResource
{
	private final MessageService messageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	//@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages()
	{
		return this.messageService.getAllMessages();
	}

	//@formatter:off

	@Path("/{messageId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") final long messageId)
	{
		return this.messageService.getMessage(messageId);
	}

	//@formatter:on
}