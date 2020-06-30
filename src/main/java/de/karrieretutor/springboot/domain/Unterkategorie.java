package de.karrieretutor.springboot.domain;

public enum Unterkategorie {
    SUBKAT1("enum.subcategory.1"),
    SUBKAT2("enum.subcategory.2"),
    SUBKAT3("enum.subcategory.3"),
    SUBKAT4("enum.subcategory.4"),
    UNTERKATEGORIE5("enum.subcategory.5"),
    UNTERKATEGORIE6("enum.subcategory.6"),
    UNTERKATEGORIE7("enum.subcategory.7"),
    UNTERKATEGORIE8("enum.subcategory.8"),
    UNTERKATEGORIE9("enum.subcategory.9");

    private final String messageKey;

    Unterkategorie(String messageKey) {
        this.messageKey = messageKey;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public String getMessage() {
        return "";
    }
}
