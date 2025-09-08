package com.mpd.biblioteca.modelo;

import android.text.TextUtils;
import android.widget.EditText;

import java.util.regex.Pattern;

public class InputValidator {


    private static final Pattern VALID_INPUT_PATTERN = Pattern.compile("^[a-zA-Z0-9 ]+$");

    public static boolean isValidInput(EditText editText) {
        String inputText = editText.getText().toString().trim();

        // 1. Verificar si está vacío
        if (TextUtils.isEmpty(inputText)) {
            editText.setError("Este campo no puede estar vacío");
            return false;
        }

        // 2. Verificar si contiene solo letras, números y espacios
        if (!VALID_INPUT_PATTERN.matcher(inputText).matches()) {
            editText.setError("Este campo solo puede contener letras, números y espacios");
            return false;
        }

        // Si pasa ambas validaciones, es válido
        editText.setError(null); // Limpia cualquier error previo
        return true;
    }
}
