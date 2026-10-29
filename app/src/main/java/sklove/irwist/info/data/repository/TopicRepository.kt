package sklove.irwist.info.data.repository

import sklove.irwist.info.data.model.Answer
import sklove.irwist.info.data.model.Question
import sklove.irwist.info.data.model.Topic

class TopicRepository {
    private fun texts(en: String, de: String, es: String, fr: String, hi: String, id: String, pt: String, ar: String) =
        mapOf("en" to en, "de" to de, "es" to es, "fr" to fr, "hi" to hi, "id" to id, "pt" to pt, "ar" to ar)

    private val topics = listOf(
        Topic(
            id = 1,
            texts = texts("Football", "Fußball", "Fútbol", "Football", "फ़ुटबॉल", "Sepak Bola", "Futebol", "كرة القدم"),
            questions = listOf(
                Question(
                    id = 101,
                    texts = texts("Who won the first FIFA World Cup?", "Wer gewann die erste Fußball-WM?", "¿Quién ganó el primer Mundial?", "Qui a gagné la première Coupe du monde ?", "पहला फीफा विश्व कप किसने जीता?", "Siapa juara Piala Dunia FIFA pertama?", "Quem venceu a primeira Copa do Mundo?", "من فاز بأول كأس عالم؟"),
                    rightAnswerId = 2,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Argentina", "Argentinien", "Argentina", "Argentine", "अर्जेंटीना", "Argentina", "Argentina", "الأرجنتين")),
                        Answer(id = 2, texts = texts("Uruguay", "Uruguay", "Uruguay", "Uruguay", "उरुग्वे", "Uruguay", "Uruguai", "أوروغواي")),
                        Answer(id = 3, texts = texts("Brazil", "Brasilien", "Brasil", "Brésil", "ब्राज़ील", "Brasil", "Brasil", "البرازيل")),
                        Answer(id = 4, texts = texts("Italy", "Italien", "Italia", "Italie", "इटली", "Italia", "Itália", "إيطاليا")),
                    ),
                ),
                Question(
                    id = 102,
                    texts = texts("Who won the 2002 FIFA World Cup?", "Wer gewann die Fußball-WM 2002?", "¿Quién ganó el Mundial de 2002?", "Qui a gagné la Coupe du monde 2002 ?", "2002 फीफा विश्व कप किसने जीता?", "Siapa juara Piala Dunia FIFA 2002?", "Quem venceu a Copa do Mundo de 2002?", "من فاز بكأس العالم 2002؟"),
                    rightAnswerId = 4,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Germany", "Deutschland", "Alemania", "Allemagne", "जर्मनी", "Jerman", "Alemanha", "ألمانيا")),
                        Answer(id = 2, texts = texts("Italy", "Italien", "Italia", "Italie", "इटली", "Italia", "Itália", "إيطاليا")),
                        Answer(id = 3, texts = texts("Argentina", "Argentinien", "Argentina", "Argentine", "अर्जेंटीना", "Argentina", "Argentina", "الأرجنتين")),
                        Answer(id = 4, texts = texts("Brazil", "Brasilien", "Brasil", "Brésil", "ब्राज़ील", "Brasil", "Brasil", "البرازيل")),
                    ),
                ),
                Question(
                    id = 103,
                    texts = texts("Which card sends a football player off?", "Welche Karte bedeutet im Fußball einen Platzverweis?", "¿Qué tarjeta expulsa a un futbolista?", "Quel carton expulse un joueur de football ?", "कौन सा कार्ड फ़ुटबॉल खिलाड़ी को बाहर भेजता है?", "Kartu apa yang mengusir pemain sepak bola?", "Qual cartão expulsa um jogador de futebol?", "أي بطاقة تطرد لاعب كرة القدم؟"),
                    rightAnswerId = 1,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Red", "Rot", "Roja", "Rouge", "लाल", "Merah", "Vermelho", "الحمراء")),
                        Answer(id = 2, texts = texts("Yellow", "Gelb", "Amarilla", "Jaune", "पीला", "Kuning", "Amarelo", "الصفراء")),
                        Answer(id = 3, texts = texts("Blue", "Blau", "Azul", "Bleu", "नीला", "Biru", "Azul", "الزرقاء")),
                        Answer(id = 4, texts = texts("Green", "Grün", "Verde", "Vert", "हरा", "Hijau", "Verde", "الخضراء")),
                    ),
                ),
                Question(
                    id = 104,
                    texts = texts("How many players start in a football team?", "Mit wie vielen Spielern beginnt ein Fußballteam?", "¿Con cuántos jugadores empieza un equipo?", "Combien de joueurs une équipe aligne-t-elle ?", "एक फ़ुटबॉल टीम कितने खिलाड़ियों से शुरू करती है?", "Berapa pemain yang mengawali laga dalam satu tim?", "Com quantos jogadores um time começa?", "بكم لاعب يبدأ فريق كرة القدم؟"),
                    rightAnswerId = 3,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Nine", "Neun", "Nueve", "Neuf", "नौ", "Sembilan", "Nove", "تسعة")),
                        Answer(id = 2, texts = texts("Ten", "Zehn", "Diez", "Dix", "दस", "Sepuluh", "Dez", "عشرة")),
                        Answer(id = 3, texts = texts("Eleven", "Elf", "Once", "Onze", "ग्यारह", "Sebelas", "Onze", "أحد عشر")),
                        Answer(id = 4, texts = texts("Twelve", "Zwölf", "Doce", "Douze", "बारह", "Dua belas", "Doze", "اثنا عشر")),
                    ),
                ),
            ),
        ),
        Topic(
            id = 2,
            texts = texts("Basketball", "Basketball", "Baloncesto", "Basket-ball", "बास्केटबॉल", "Bola Basket", "Basquete", "كرة السلة"),
            questions = listOf(
                Question(
                    id = 201,
                    texts = texts("Who invented basketball?", "Wer erfand Basketball?", "¿Quién inventó el baloncesto?", "Qui a inventé le basket-ball ?", "बास्केटबॉल का आविष्कार किसने किया?", "Siapa yang menciptakan bola basket?", "Quem inventou o basquete?", "من اخترع كرة السلة؟"),
                    rightAnswerId = 3,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Walter Camp", "Walter Camp", "Walter Camp", "Walter Camp", "वाल्टर कैंप", "Walter Camp", "Walter Camp", "والتر كامب")),
                        Answer(id = 2, texts = texts("William Morgan", "William Morgan", "William Morgan", "William Morgan", "विलियम मॉर्गन", "William Morgan", "William Morgan", "ويليام مورغان")),
                        Answer(id = 3, texts = texts("James Naismith", "James Naismith", "James Naismith", "James Naismith", "जेम्स नाइस्मिथ", "James Naismith", "James Naismith", "جيمس نايسميث")),
                        Answer(id = 4, texts = texts("Pierre de Coubertin", "Pierre de Coubertin", "Pierre de Coubertin", "Pierre de Coubertin", "पियरे द कुबर्तिन", "Pierre de Coubertin", "Pierre de Coubertin", "بيير دي كوبرتان")),
                    ),
                ),
                Question(
                    id = 202,
                    texts = texts("How long is an NBA regulation game?", "Wie lange dauert ein reguläres NBA-Spiel?", "¿Cuánto dura un partido reglamentario de la NBA?", "Combien dure un match NBA réglementaire ?", "एक नियमित NBA मैच कितने मिनट का होता है?", "Berapa lama pertandingan NBA reguler?", "Quanto dura um jogo regulamentar da NBA?", "كم تستغرق مباراة NBA في وقتها الأصلي؟"),
                    rightAnswerId = 1,
                    answers = listOf(
                        Answer(id = 1, texts = texts("48 minutes", "48 Minuten", "48 minutos", "48 minutes", "48 मिनट", "48 menit", "48 minutos", "48 دقيقة")),
                        Answer(id = 2, texts = texts("40 minutes", "40 Minuten", "40 minutos", "40 minutes", "40 मिनट", "40 menit", "40 minutos", "40 دقيقة")),
                        Answer(id = 3, texts = texts("50 minutes", "50 Minuten", "50 minutos", "50 minutes", "50 मिनट", "50 menit", "50 minutos", "50 دقيقة")),
                        Answer(id = 4, texts = texts("60 minutes", "60 Minuten", "60 minutos", "60 minutes", "60 मिनट", "60 menit", "60 minutos", "60 دقيقة")),
                    ),
                ),
                Question(
                    id = 203,
                    texts = texts("How many points is a free throw worth?", "Wie viele Punkte zählt ein Freiwurf?", "¿Cuántos puntos vale un tiro libre?", "Combien de points vaut un lancer franc ?", "फ्री थ्रो से कितने अंक मिलते हैं?", "Berapa nilai satu lemparan bebas?", "Quantos pontos vale um lance livre?", "كم نقطة تساوي الرمية الحرة؟"),
                    rightAnswerId = 4,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Four", "Vier", "Cuatro", "Quatre", "चार", "Empat", "Quatro", "أربع")),
                        Answer(id = 2, texts = texts("Three", "Drei", "Tres", "Trois", "तीन", "Tiga", "Três", "ثلاث")),
                        Answer(id = 3, texts = texts("Two", "Zwei", "Dos", "Deux", "दो", "Dua", "Dois", "اثنتان")),
                        Answer(id = 4, texts = texts("One", "Eins", "Uno", "Un", "एक", "Satu", "Um", "واحدة")),
                    ),
                ),
                Question(
                    id = 204,
                    texts = texts("How high is a basketball hoop?", "Wie hoch hängt ein Basketballkorb?", "¿A qué altura está el aro?", "À quelle hauteur se trouve le panier ?", "बास्केटबॉल का घेरा कितनी ऊँचाई पर होता है?", "Berapa tinggi ring bola basket?", "Qual é a altura da cesta?", "ما ارتفاع سلة كرة السلة؟"),
                    rightAnswerId = 2,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Nine feet", "Neun Fuß", "Nueve pies", "Neuf pieds", "नौ फ़ुट", "Sembilan kaki", "Nove pés", "تسعة أقدام")),
                        Answer(id = 2, texts = texts("Ten feet", "Zehn Fuß", "Diez pies", "Dix pieds", "दस फ़ुट", "Sepuluh kaki", "Dez pés", "عشرة أقدام")),
                        Answer(id = 3, texts = texts("Eleven feet", "Elf Fuß", "Once pies", "Onze pieds", "ग्यारह फ़ुट", "Sebelas kaki", "Onze pés", "أحد عشر قدمًا")),
                        Answer(id = 4, texts = texts("Twelve feet", "Zwölf Fuß", "Doce pies", "Douze pieds", "बारह फ़ुट", "Dua belas kaki", "Doze pés", "اثنا عشر قدمًا")),
                    ),
                ),
            ),
        ),
        Topic(
            id = 3,
            texts = texts("Tennis", "Tennis", "Tenis", "Tennis", "टेनिस", "Tenis", "Tênis", "التنس"),
            questions = listOf(
                Question(
                    id = 301,
                    texts = texts("On which surface is Wimbledon played?", "Auf welchem Belag wird Wimbledon gespielt?", "¿En qué superficie se juega Wimbledon?", "Sur quelle surface joue-t-on Wimbledon ?", "विंबलडन किस सतह पर खेला जाता है?", "Di permukaan apa Wimbledon dimainkan?", "Em qual superfície Wimbledon é disputado?", "على أي أرضية تقام ويمبلدون؟"),
                    rightAnswerId = 2,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Clay", "Sand", "Arcilla", "Terre battue", "क्ले", "Tanah liat", "Saibro", "ترابية")),
                        Answer(id = 2, texts = texts("Grass", "Rasen", "Hierba", "Gazon", "घास", "Rumput", "Grama", "عشبية")),
                        Answer(id = 3, texts = texts("Hard court", "Hartplatz", "Pista dura", "Dur", "हार्ड कोर्ट", "Lapangan keras", "Quadra dura", "صلبة")),
                        Answer(id = 4, texts = texts("Carpet", "Teppich", "Moqueta", "Moquette", "कारपेट", "Karpet", "Carpete", "سجاد")),
                    ),
                ),
                Question(
                    id = 302,
                    texts = texts("How many Grand Slams are played yearly?", "Wie viele Grand Slams gibt es pro Jahr?", "¿Cuántos Grand Slam se juegan al año?", "Combien de Grands Chelems ont lieu par an ?", "हर साल कितने ग्रैंड स्लैम होते हैं?", "Berapa Grand Slam yang digelar tiap tahun?", "Quantos Grand Slams são disputados por ano?", "كم بطولة غراند سلام تقام سنويًا؟"),
                    rightAnswerId = 4,
                    answers = listOf(
                        Answer(id = 1, texts = texts("One", "Eins", "Uno", "Un", "एक", "Satu", "Um", "واحدة")),
                        Answer(id = 2, texts = texts("Two", "Zwei", "Dos", "Deux", "दो", "Dua", "Dois", "اثنتان")),
                        Answer(id = 3, texts = texts("Three", "Drei", "Tres", "Trois", "तीन", "Tiga", "Três", "ثلاث")),
                        Answer(id = 4, texts = texts("Four", "Vier", "Cuatro", "Quatre", "चार", "Empat", "Quatro", "أربع")),
                    ),
                ),
                Question(
                    id = 303,
                    texts = texts("What score follows deuce in tennis?", "Welcher Spielstand folgt auf Einstand?", "¿Qué puntuación sigue al iguales?", "Quel score suit l’égalité au tennis ?", "टेनिस में ड्यूस के बाद क्या आता है?", "Skor apa yang mengikuti deuce?", "Qual pontuação vem após o deuce?", "ما النتيجة التي تلي التعادل؟"),
                    rightAnswerId = 1,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Advantage", "Vorteil", "Ventaja", "Avantage", "एडवांटेज", "Advantage", "Vantagem", "أفضلية")),
                        Answer(id = 2, texts = texts("Game point", "Spielball", "Punto de juego", "Balle de jeu", "गेम पॉइंट", "Game point", "Game point", "نقطة الشوط")),
                        Answer(id = 3, texts = texts("Break point", "Breakball", "Punto de quiebre", "Balle de break", "ब्रेक पॉइंट", "Break point", "Break point", "نقطة كسر الإرسال")),
                        Answer(id = 4, texts = texts("Love", "Null", "Cero", "Zéro", "लव", "Love", "Zero", "صفر")),
                    ),
                ),
                Question(
                    id = 304,
                    texts = texts("The Davis Cup is a team event for whom?", "Für wen ist der Davis Cup ein Teamwettbewerb?", "¿Para quién es la Copa Davis una competición por equipos?", "La Coupe Davis est une épreuve par équipes pour qui ?", "डेविस कप किसका टीम टूर्नामेंट है?", "Piala Davis adalah ajang beregu untuk siapa?", "A Copa Davis é uma competição por equipes para quem?", "كأس ديفيز بطولة فرق لمن؟"),
                    rightAnswerId = 3,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Junior girls", "Juniorinnen", "Júnior femenino", "Juniors filles", "जूनियर लड़कियाँ", "Putri junior", "Jovens femininas", "الناشئات")),
                        Answer(id = 2, texts = texts("Women", "Frauen", "Mujeres", "Femmes", "महिलाएँ", "Putri", "Mulheres", "السيدات")),
                        Answer(id = 3, texts = texts("Men", "Männer", "Hombres", "Hommes", "पुरुष", "Putra", "Homens", "الرجال")),
                        Answer(id = 4, texts = texts("Mixed pairs", "Mixed-Paare", "Parejas mixtas", "Paires mixtes", "मिश्रित जोड़ियाँ", "Pasangan campuran", "Duplas mistas", "الزوجي المختلط")),
                    ),
                ),
            ),
        ),
        Topic(
            id = 4,
            texts = texts("Olympics", "Olympia", "Juegos Olímpicos", "Jeux olympiques", "ओलंपिक", "Olimpiade", "Olimpíadas", "الأولمبياد"),
            questions = listOf(
                Question(
                    id = 401,
                    texts = texts("How many rings are on the Olympic symbol?", "Wie viele Ringe hat das olympische Symbol?", "¿Cuántos anillos tiene el símbolo olímpico?", "Combien d’anneaux compte le symbole olympique ?", "ओलंपिक चिह्न में कितने छल्ले हैं?", "Berapa cincin pada simbol Olimpiade?", "Quantos anéis há no símbolo olímpico?", "كم حلقة في الشعار الأولمبي؟"),
                    rightAnswerId = 3,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Three", "Drei", "Tres", "Trois", "तीन", "Tiga", "Três", "ثلاث")),
                        Answer(id = 2, texts = texts("Four", "Vier", "Cuatro", "Quatre", "चार", "Empat", "Quatro", "أربع")),
                        Answer(id = 3, texts = texts("Five", "Fünf", "Cinco", "Cinq", "पाँच", "Lima", "Cinco", "خمس")),
                        Answer(id = 4, texts = texts("Six", "Sechs", "Seis", "Six", "छह", "Enam", "Seis", "ست")),
                    ),
                ),
                Question(
                    id = 402,
                    texts = texts("Where were the first modern Olympics held?", "Wo fanden die ersten modernen Olympischen Spiele statt?", "¿Dónde se celebraron los primeros Juegos Olímpicos modernos?", "Où ont eu lieu les premiers Jeux olympiques modernes ?", "पहले आधुनिक ओलंपिक कहाँ हुए?", "Di mana Olimpiade modern pertama digelar?", "Onde ocorreram os primeiros Jogos Olímpicos modernos?", "أين أقيمت أول دورة أولمبية حديثة؟"),
                    rightAnswerId = 1,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Athens", "Athen", "Atenas", "Athènes", "एथेंस", "Athena", "Atenas", "أثينا")),
                        Answer(id = 2, texts = texts("Paris", "Paris", "París", "Paris", "पेरिस", "Paris", "Paris", "باريس")),
                        Answer(id = 3, texts = texts("London", "London", "Londres", "Londres", "लंदन", "London", "Londres", "لندن")),
                        Answer(id = 4, texts = texts("Rome", "Rom", "Roma", "Rome", "रोम", "Roma", "Roma", "روما")),
                    ),
                ),
                Question(
                    id = 403,
                    texts = texts("What is the official marathon distance?", "Wie lang ist die offizielle Marathondistanz?", "¿Cuál es la distancia oficial del maratón?", "Quelle est la distance officielle du marathon ?", "मैराथन की आधिकारिक दूरी कितनी है?", "Berapa jarak resmi maraton?", "Qual é a distância oficial da maratona?", "ما المسافة الرسمية للماراثون؟"),
                    rightAnswerId = 4,
                    answers = listOf(
                        Answer(id = 1, texts = texts("40 km", "40 km", "40 km", "40 km", "40 किमी", "40 km", "40 km", "40 كم")),
                        Answer(id = 2, texts = texts("41 km", "41 km", "41 km", "41 km", "41 किमी", "41 km", "41 km", "41 كم")),
                        Answer(id = 3, texts = texts("42 km", "42 km", "42 km", "42 km", "42 किमी", "42 km", "42 km", "42 كم")),
                        Answer(id = 4, texts = texts("42.195 km", "42,195 km", "42,195 km", "42,195 km", "42.195 किमी", "42,195 km", "42,195 km", "\u200E42.195\u200E كم")),
                    ),
                ),
                Question(
                    id = 404,
                    texts = texts("Where is the Olympic flame traditionally lit?", "Wo wird das olympische Feuer traditionell entzündet?", "¿Dónde se enciende la llama olímpica?", "Où la flamme olympique est-elle allumée ?", "ओलंपिक मशाल पारंपरिक रूप से कहाँ जलाई जाती है?", "Di mana api Olimpiade dinyalakan?", "Onde a chama olímpica é acesa?", "أين تُشعل الشعلة الأولمبية تقليديًا؟"),
                    rightAnswerId = 2,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Athens", "Athen", "Atenas", "Athènes", "एथेंस", "Athena", "Atenas", "أثينا")),
                        Answer(id = 2, texts = texts("Olympia", "Olympia", "Olimpia", "Olympie", "ओलंपिया", "Olympia", "Olímpia", "أولمبيا")),
                        Answer(id = 3, texts = texts("Sparta", "Sparta", "Esparta", "Sparte", "स्पार्टा", "Sparta", "Esparta", "إسبرطة")),
                        Answer(id = 4, texts = texts("Marathon", "Marathon", "Maratón", "Marathon", "मैराथन", "Marathon", "Maratona", "ماراثون")),
                    ),
                ),
            ),
        ),
        Topic(
            id = 5,
            texts = texts("Motorsport", "Motorsport", "Automovilismo", "Sports mécaniques", "मोटरस्पोर्ट", "Olahraga Motor", "Automobilismo", "رياضة المحركات"),
            questions = listOf(
                Question(
                    id = 501,
                    texts = texts("Which flag signals the end of a motor race?", "Welche Flagge signalisiert das Rennende?", "¿Qué bandera señala el final de una carrera?", "Quel drapeau signale la fin d’une course ?", "कौन सा झंडा रेस के अंत का संकेत देता है?", "Bendera apa yang menandai akhir balapan?", "Qual bandeira sinaliza o fim de uma corrida?", "أي علم يشير إلى نهاية السباق؟"),
                    rightAnswerId = 4,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Yellow", "Gelb", "Amarilla", "Jaune", "पीला", "Kuning", "Amarela", "الأصفر")),
                        Answer(id = 2, texts = texts("Red", "Rot", "Roja", "Rouge", "लाल", "Merah", "Vermelha", "الأحمر")),
                        Answer(id = 3, texts = texts("Blue", "Blau", "Azul", "Bleu", "नीला", "Biru", "Azul", "الأزرق")),
                        Answer(id = 4, texts = texts("Checkered", "Schwarz-weiß kariert", "A cuadros", "À damier", "चेकर्ड", "Kotak-kotak", "Quadriculada", "الشطرنجي")),
                    ),
                ),
                Question(
                    id = 502,
                    texts = texts("How long is the 24 Hours of Le Mans?", "Wie lange dauern die 24 Stunden von Le Mans?", "¿Cuánto duran las 24 Horas de Le Mans?", "Combien durent les 24 Heures du Mans ?", "ले मैंस 24 घंटे की रेस कितनी लंबी है?", "Berapa lama balapan 24 Hours of Le Mans?", "Quanto duram as 24 Horas de Le Mans?", "كم يستمر سباق 24 ساعة في لومان؟"),
                    rightAnswerId = 2,
                    answers = listOf(
                        Answer(id = 1, texts = texts("12 hours", "12 Stunden", "12 horas", "12 heures", "12 घंटे", "12 jam", "12 horas", "12 ساعة")),
                        Answer(id = 2, texts = texts("24 hours", "24 Stunden", "24 horas", "24 heures", "24 घंटे", "24 jam", "24 horas", "24 ساعة")),
                        Answer(id = 3, texts = texts("36 hours", "36 Stunden", "36 horas", "36 heures", "36 घंटे", "36 jam", "36 horas", "36 ساعة")),
                        Answer(id = 4, texts = texts("48 hours", "48 Stunden", "48 horas", "48 heures", "48 घंटे", "48 jam", "48 horas", "48 ساعة")),
                    ),
                ),
                Question(
                    id = 503,
                    texts = texts("What distance gives the Indianapolis 500 its name?", "Welche Distanz gibt dem Indianapolis 500 seinen Namen?", "¿Qué distancia da nombre a las 500 Millas de Indianápolis?", "Quelle distance donne son nom aux 500 Miles d’Indianapolis ?", "इंडियानापोलिस 500 का नाम किस दूरी से आया है?", "Jarak apa yang menjadi nama Indianapolis 500?", "Qual distância dá nome às 500 Milhas de Indianápolis?", "ما المسافة التي تمنح إنديانابوليس 500 اسمها؟"),
                    rightAnswerId = 1,
                    answers = listOf(
                        Answer(id = 1, texts = texts("500 miles", "500 Meilen", "500 millas", "500 miles", "500 मील", "500 mil", "500 milhas", "500 ميل")),
                        Answer(id = 2, texts = texts("500 km", "500 km", "500 km", "500 km", "500 किमी", "500 km", "500 km", "500 كم")),
                        Answer(id = 3, texts = texts("400 miles", "400 Meilen", "400 millas", "400 miles", "400 मील", "400 mil", "400 milhas", "400 ميل")),
                        Answer(id = 4, texts = texts("600 miles", "600 Meilen", "600 millas", "600 miles", "600 मील", "600 mil", "600 milhas", "600 ميل")),
                    ),
                ),
                Question(
                    id = 504,
                    texts = texts("How many wheels does a MotoGP bike have?", "Wie viele Räder hat ein MotoGP-Motorrad?", "¿Cuántas ruedas tiene una moto de MotoGP?", "Combien de roues a une moto de MotoGP ?", "MotoGP बाइक में कितने पहिए होते हैं?", "Berapa roda yang dimiliki motor MotoGP?", "Quantas rodas tem uma moto de MotoGP?", "كم عجلة في دراجة MotoGP؟"),
                    rightAnswerId = 3,
                    answers = listOf(
                        Answer(id = 1, texts = texts("Four", "Vier", "Cuatro", "Quatre", "चार", "Empat", "Quatro", "أربع")),
                        Answer(id = 2, texts = texts("Three", "Drei", "Tres", "Trois", "तीन", "Tiga", "Três", "ثلاث")),
                        Answer(id = 3, texts = texts("Two", "Zwei", "Dos", "Deux", "दो", "Dua", "Duas", "اثنتان")),
                        Answer(id = 4, texts = texts("One", "Eins", "Uno", "Une", "एक", "Satu", "Uma", "واحدة")),
                    ),
                ),
            ),
        ),
    )

    fun getTopics(): List<Topic> = topics
}
