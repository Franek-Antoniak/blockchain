package blockchain.messenger.controller;

import blockchain.messenger.Messenger;

public class MessengerController {
    private final Messenger messenger = Messenger.getInstance();

    private MessengerController() {

    }

    public static MessengerController getInstance() {
        return MessengerControllerSingleton.instance;
    }

    private static class MessengerControllerSingleton {
        private static final MessengerController instance = new MessengerController();
    }

    public void sendNewMessage(String message) {
        messenger.addMessage(message);
    }
}
