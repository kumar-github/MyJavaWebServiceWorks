package com.kumar.learningrest.model;

import java.time.LocalDateTime;

/**
 * @author Saravana Kumar M
 *
 */

//@XmlRootElement
public class Message
{
	private long id;
	private String message;
	private String author;
	private LocalDateTime created;

	public Message()
	{
		super();
	}

	public Message(final long id, final String message, final String author, final LocalDateTime created)
	{
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = created;
	}

	public long getId()
	{
		return this.id;
	}

	public void setId(final long id)
	{
		this.id = id;
	}

	public String getMessage()
	{
		return this.message;
	}

	public void setMessage(final String message)
	{
		this.message = message;
	}

	public String getAuthor()
	{
		return this.author;
	}

	public void setAuthor(final String author)
	{
		this.author = author;
	}

	public LocalDateTime getCreated()
	{
		return this.created;
	}

	public void setCreated(final LocalDateTime created)
	{
		this.created = created;
	}

	@Override
	public String toString()
	{
		return this.id + " - " + this.message + " - " + this.author + " - " + this.created;
	}
}