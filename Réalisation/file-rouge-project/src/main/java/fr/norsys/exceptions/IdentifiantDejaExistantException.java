package fr.norsys.exceptions;

public class IdentifiantDejaExistantException extends Exception {
	private static final long serialVersionUID = -7187810220545068658L;
	
	public IdentifiantDejaExistantException(String message)
	{
		super(message);
	}

}
