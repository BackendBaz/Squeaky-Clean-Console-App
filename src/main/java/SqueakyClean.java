class SqueakyClean {

    static String clean(String identifier) {
        // Note: the input string is guaranteed to be non-null.
        identifier = identifier.replace(' ', '_');
        char[] kebabChars = identifier.toCharArray();
        StringBuilder camelCaseResult = new StringBuilder();
        for (int i = 0; i < kebabChars.length; i++) {
            if (kebabChars[i] == '-' && i != kebabChars.length - 1)
                kebabChars[i + 1] = Character.toUpperCase(kebabChars[i + 1]);
            camelCaseResult.append(kebabChars[i]);
        }
        identifier = camelCaseResult.toString().replace("-", "");
        return identifier
                .replace('4', 'a')
                .replace('3', 'e')
                .replace('0', 'o')
                .replace('1', 'l')
                .replace('7', 't')
                .replace("¡", "")  // ¡
                .replace("!", ""); // !
    }

}
