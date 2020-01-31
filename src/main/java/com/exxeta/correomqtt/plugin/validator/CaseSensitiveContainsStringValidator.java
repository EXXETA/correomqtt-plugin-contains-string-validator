package com.exxeta.correomqtt.plugin.validator;

import com.exxeta.correomqtt.plugin.spi.ExtensionId;
import com.exxeta.correomqtt.plugin.spi.MessageValidatorHook;
import org.pf4j.Extension;

@Extension(points = {MessageValidatorHook.class})
@ExtensionId("caseSensitive")
public class CaseSensitiveContainsStringValidator extends ContainsStringValidator {

    @Override
    public Validation isMessageValid(String payload) {
        String tooltip = "Contains '" + text + "' - case sensitive";
        return new Validation(payload.contains(text), tooltip);
    }
}
