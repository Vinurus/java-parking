package javaparking.Users;

public abstract class User {
    protected boolean isAnonymous = false;
    protected boolean takeSpace = false;

    protected String identifier;

    public User() {
        this.isAnonymous = true;
    }

    public User(String identifier) {
        this.identifier = identifier;
    }

    final public String identify()
    {
        if (this.isAnonymous) {
            return this.getAnonymousIdentifier();
        }

        return this.getIdentifier();
    }

    protected String getAnonymousIdentifier()
    {
        return "anonymous by " + this.getClass().getSimpleName().toLowerCase();
    }

    abstract protected String getIdentifier();
}