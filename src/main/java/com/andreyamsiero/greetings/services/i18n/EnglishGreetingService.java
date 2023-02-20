package com.andreyamsiero.greetings.services.i18n;

import com.andreyamsiero.greetings.services.GreetingsService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"en", "default"})
@Service("i18nService")
public class EnglishGreetingService implements GreetingsService {
    @Override
    public String sayGreetings() {
        return "Hello World!";
    }
}
