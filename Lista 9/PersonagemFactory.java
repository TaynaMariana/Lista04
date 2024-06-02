class PersonagemFactory {
    public static Terraqueo criarKuririn() {
        return new Terraqueo("Kuririn", 35, "Masculino", "Dragon Ball Z", 10000, "Kienzan", "Terra", "Cidade do Oeste");
    }

    public static Sayajin criarGoku() {
        return new Sayajin("Goku", 40, "Masculino", "Dragon Ball Z", 90000, "Kamehameha", 5, true);
    }

    public static Sayajin criarGohan() {
        return new Sayajin("Gohan", 23, "Masculino", "Dragon Ball Z", 80000, "Masenko", 3, false);
    }

    public static Namekuseijin criarDende() {
        return new Namekuseijin("Dende", 25, "Masculino", "Dragon Ball Z", 5000, "Cura", 7, true);
    }
}