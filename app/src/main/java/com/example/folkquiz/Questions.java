package com.example.folkquiz;

public class Questions {

    public String MusicQuestions[] = {
            "Как се изпълнява най-често Шопската народна песен?",
            "От колко певици се изпълнява най-често първият глас на Шопската народна песен?",
            //"Какво е характерно за шопския двуглас?",
            "Кои инструменти се използват най-често в Шопската фолклорна област?",
            "Разновидност на кой музикален инструмен е кемене?",
            "Какво НЕ е възпявано в песните от Тракийската фолклорна област?",
            "С каква цел са се изпълнявали песните в Тракийската фолклорна област?",
            "Коя е най-голяната група тракийски песни?",
            "Какво е характерно за родопските народни песни?",
            "Кой музикален инструмент е характерен за Родопската фолклорна област?",
            "Как се нарича втория глас при песните от Пиринската фолклорна област?",
            "Какъв е характерния сюжет за мъжките пирински народни песни?",
            "За коя фолклорна област се отнася характерното \"ацане\" при многогласните песни?",
            "Какви песни са характерни за Добруджанската фолклорна област?",
            "В коя фолклорна област се среща ръчната хармоника(наречена от местните физармоника или физа)?",
            "В какъв тактов размер обичайно са песните в Добруджанската фоклорна област?"
    };

    public String MusicChoices[][] = {
            {"едногласно/двугласно", "тригласно", "едногласно/тригласно"},
            {"една", "две", "три"},
            //{"Певиците от втори глас се стараят да заглушат тези от първия", "Певиците от първи глас се стараят да заглушат тези от втория", "Певиците от двата гласа пеят еднакво силно"},
            {"гъдулка, дудук, двуянка", "каба гайда, кавал, тъпан", "кавал, гъдулка, тамбура"},
            {"гъдулка", "кавал", "тъпан"},
            {"стада", "бране на царевица", "жътва"},
            {"облекчаване на работата", "натоварване", "безцелно"},
            {"хороводни", "сватбени", "обредни"},
            {"изпълняват се от мъже и жени", "изпълняват се само от жени", "изпълняват се само от жени"},
            {"каба гайда", "тамбура", "дудук"},
            {"исо", "осо", "асо"},
            {"исторически и революционен", "жътварски", "сватбен"},
            {"Пиринска", "Шопска", "Добруджанска"},
            {"бавни, едноласни", "бързи, едногланси", "бавни, двугласни"},
            {"Добруджанска", "Северняшка", "Тракийска"},
            {"2/4", "3/4", "7/8"},
    };

    public String MusicCorrectAnswers[] = {
            "едногласно/двугласно",
            "една",
            //"Певиците от втори глас се стараят да заглушат тези от първия",
            "гъдулка, дудук, двуянка",
            "гъдулка",
            "стада",
            "облекчаване на работата",
            "хороводни",
            "изпълняват се от мъже и жени",
            "каба гайда",
            "исо",
            "исторически и революционен",
            "Пиринска",
            "бавни, едноласни",
            "Добруджанска",
            "2/4"
    };

    public String[] DancesQuestions = {
            "Какви видове движения се разграничават в шопските народни танци?",
            "Основните видове движения в шопските народни танци са:",
            "Основните движения в шопските народни танци са:",
            "Действените движения в шопските народни танци са:",
            "Кое е най-популярното хоро в Шопската фолклорна област?",
            "От колко такта се състои Шопското хоро за пояс?",
            "В какъв размер се тактува Шопското хоро за пояс?",
            "В какво темпо се играят женските тракийски народни танци?",
            "В каква посока се насочват движенията при тракийските народни танци?",
            "В коя фолклорна област е характерно хората да бъдат само мъжки или само женски?",
            "В коя фолклорна област е характерно за мъжете да се хващат за длани докато са на хорото?",
            "Как се стъпва при женските родопски народни танци?",
            "За коя фолклорна област е характерно Македонското хоро?",
            "Характерно при народните танци в Добруджанската фолклорна област е:",
            "За коя фолклорна област е характерно плавното полюшване при народните танци?",
            "В коя фолклорна област е характерно за мъжете да се хващат за пояса(на леса)?",
            "Характерно при народните танци в Северняшката фолклорна област е:",
            "Северняшките хора са предимно:",
            "Кои гости са били неизменна част от празненствата в Северняшката фолклорна област?"
    };

    public String[][] DancesChoices = {
            {"основни и действени", "основни", "действителни"},
            {"Шопска, Граовка, Ръченична", "само Шопска", "само Граовка"},
            {"широки", "ситни", "дребни"},
            {"ситни", "широки", "едри"},
            {"Шопско за пояс", "Право", "Дунавско"},
            {"десет", "седем", "четири"},
            {"2/4 или 7/16", "2/4 или 3/4", "7/8 или 3/4"},
            {"умерено", "бързо", "бавно"},
            {"към земята", "към небето", "към публиката"},
            {"Родопска", "Шопска", "Тракийска"},
            {"Родопска", "Пиринска", "Добруджанска"},
            {"с цяло ходило", "на пръсти", "на пети"},
            {"Пиринска", "Северняшка", "Родопска"},
            {"приклякане", "подскачане", "въртене"},
            {"Добруджанска", "Тракийска", "Родопска"},
            {"Добруджанска", "Пиринска", "Тракийска"},
            {"подскачане", "приклякане", "въртене"},
            {"бързи", "бавни", "умерени"},
            {"свирачи", "пастири", "занаятчии"}
    };

    public String[] DancesCorrectAnswers = {
            "основни и действени",
            "Шопска, Граовка, Ръченична",
            "широки",
            "ситни",
            "Шопско за пояс",
            "десет",
            "2/4 или 7/16",
            "умерено",
            "към земята",
            "Родопска",
            "Родопска",
            "с цяло ходило",
            "Пиринска",
            "приклякане",
            "Добруджанска",
            "Добруджанска",
            "подскачане",
            "бързи",
            "свирачи"
    };

    public String[] ClothesQuestions = {
            "С какво се характеризира шопската народна носия?",
            "Какво изразява женското облекло в Шопската фолклорна област?",
            "По какво НЕ се различават носиите на младите и старите мъже в Шопската фолклорна област?",
            "Какъв вид мъжка носия е характерна за Тракийската фолклорна област?",
            "Какъв цвят е забрадката при женската родопска народна носия?",
            "Какви цветове фигурират в престилката на женската родопска народна носия?",
            "За коя фолклорна област са характерни вълнените шарени чорапи в женската народна носия?",
            "Какъв вид мъжка носия е характерна за Пиринската фолклорна област?",
            "Какво определя поводът, по който е облечена мъжката пиринска народна носия?",
            "Кой елемент от народната носия е характерен само за Пиринската фолклорна област?"
    };

    public String[][] ClothesChoices = {
            {"лека и удобна", "плътна и тежка", "лека и неудобна"},
            {"положението на жената в семейството", "заможността на жената", "способността на жената"},
            {"частите на носията", "декорация и елементи", "цвят на пояса"},
            {"чернодрешна", "белодрешна", "червенодрешна"},
            {"виненочервена", "жълта", "синя"},
            {"оранжев, жълт, червен", "зелен, син, жълт", "лилав, червен, оранжев"},
            {"Родопска", "Северняшка", "Тракийска"},
            {"белодрешна", "чернодрешна", "червенодрешна"},
            {"броя клинове", "дължината на ръкавите", "чорапите"},
            {"сая", "престилка", "пафти"}
    };

    public String[] ClothesCorrectAnswers = {
            "лека и удобна",
            "положението на жената в семейството",
            "частите на носията",
            "чернодрешна",
            "виненочервена",
            "оранжев, жълт, червен",
            "Родопска",
            "белодрешна",
            "броя клинове",
            "сая"
    };
}
