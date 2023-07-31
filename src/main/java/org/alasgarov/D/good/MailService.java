package org.alasgarov.D.good;

public class MailService {

    public void sendMail(MailServer mailServer){
        mailServer.send("");
    }
}

interface MailServer{
    void send(String to);
}

class Gmail implements MailServer{

    @Override
    public void send(String to) {

    }
}

class MailRu implements MailServer{

    @Override
    public void send(String to) {

    }
}

class Yandex implements MailServer{

    @Override
    public void send(String to) {

    }
}

