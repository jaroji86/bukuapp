package id.ac.polbeng.jaroji.bukuapp

import java.util.ArrayList

object BookData {
    private val title = arrayOf(
        "Mudah Tafsir Ibnu Katsir Jilid 1",
        "Tafsir Al Azhar Hamka Jilid 1",
        "Tafisr Al Munir Jilid 1",
        "Tafsir Fi Zhilalil Qur'an",
        "Tafsir Jalalain",
        "Tafsir Al Wa'ie Juz 'Amma",
        "Sirah Nabawiyah Sisi Politis Perjuangan Rasulullah saw",
        "Al Maghazi Jilid 1",
        "Sejarah Nasionalisme di Dunia Islam",
        "Nyali-nyali Dakwah di Penjuru Negeri",
        "Risalah Khitbah"
    )

    private val detail = arrayOf(
        "Tafsir Ibnu Katsir merupakan kitab tafsir yang mencuri perhatian banyak ulama, klasik dan kontemporer. Tafsir ini diringkas oleh banyak ulama, diterjemahkan ke dalam berbagai bahasa, serta di-jadikan kitab standar di universitas-universitas Islam terkemuka. Namun, pembaca awam seringkali kesulitan dalam memahami kitab tafsir tersebut. Hal itulah yang berhasil dipecahkan Maghfirah Pustaka. Kami menerbitkan KitabTafsir Ibnu Katsir ini dalam format yang mudah dipahami, bahkan oleh pembaca awam sekalipun. Kelebihan-kelebihan dari buku Mudah Tafsir Ibnu Katsir yang kami terbitkan adalah: Shahih. Tafsir ini hanya mendasarkan pada hadits-hadits shahih serta membuang riwayat-riwayat isra'illiyyat, sehingga sangat me-nenteramkan pembaca ketika menelaahnya. Mudah. Bahasa dan pemaparannya sangat mudah, bahkan mudah dipahami oleh orang awam sekalipun. Sistematis. Karena ditujukan untuk para pembaca masa kini, buku Mudah Tafsir Ibnu Katsir ini dipaparkan dalam format yang siste-matis, memperhatikan tanda baca, dan gaya bahasa yang dise-suaikan. Lengkap. Kelengkapan tafsir Ibnu Katsir ini tetap terjaga; ayat-ayat yang ditafsirkan, pendapat Ibnu Katsir terkait ayat-ayat tersebut, serta kesimpulan-kesimpulan ilmiahnya menjadi satu kesatuan utuh yang lengkap disajikan di dalam buku ini. Oleh karenanya, jika Anda ingin memahami tafsir al-Qur'an al-Karim tanpa mengerutkan kening ketika membacanya maka pilihan Anda sangat tepat jika membaca buku ini! Selamat membaca dan segera raih manfaatnya...!",
        "Tafsir al-Azhar menitikberatkan penjelasan ayat-ayat Al-Qur'an dengan ungkapan yang teliti, menjelaskan makna-makna yang dimaksud dalam Al-Qur’an dengan bahasa yang indah dan menarik, dan menghubungkan ayat dengan realitas sosial dan sistem budaya yang ada.\n" +
                "Tafsir al-Azhar adalah hasil karya terbesar dari ulama ternama yaitu Prof. Dr. HAMKA.\n" +
                "Dalam penyusunan Tafsir al-Azhar Buya HAMKA menggunakan metode tahlili (analitis) tafsir Al-Qur’an dengan Al-Qur’an, tafsir Al-Qur’an dengan hadits, pendapat sahabat dan tabiin, Tafsir dengan tafsir muktabar penggunaan syair menggunakan analisis bilma’tsur menganalisis dengan kemampuan analisis sendiri, dan disusun tanpa membawa pertikaian antar madzhab.\n" +
                "Buya HAMKA membicarakan permasalahan sejarah sosial dan budaya di Indonesia.\n" +
                "Beliau juga mendemonstrasikan keluasan pengetahuan menekankan pemahaman ayat secara menyeluruh (mengutip ulama-ulama terdahulu) mendialogkan antara teks Al-Qur’an dengan kondisi umat Islam saat Tafsir al-Azhar ditulis",
        "Tafsir almunir adalah hasil karya terbaik yang pernah dimiliki umat islam di era modern ini. Buku ini sangat laris di timur tengah dan negara-negara jazirah Arab. Karya ini hadir sebagai rujukan utama disetiap kajian tafsir disetiap majlis ilmu. Secara bobot dan kualitas buku ini jelas memenuhi hal tersebut. Dalam karya fenomenal Prof. Dr. Wahbah Zuhaili ini anda akan mendapatkan pembahasan-pembahasan penting dalam mengkaji Al-Quran meliputi hal-hal berikut: metode panyusunan tafsir berdasarpada metode tafsir bil matsur dan tafsir bir rayi ada penjelasan kandungan ayat secara terperinci dan menyeluruh Di jelaskan sebab turunnya ayat di setiap pembahasan ayat diperincikan penjelasan penjelasan dari segi qiraat Iraab Balaghah dan mufradah lughawiyah. Tafsir ini berpedoman pada kitab-kitab induk tafsir dengan berbagai manhajnya tafsir ini menghapus riwayat-riwayat israiliyat. Sebuah literatur tafsir Al-Quran yang harus anda miliki karena sangat lengkap dan bagus Buku ini merupakan jilid ke1 dari 15 jilid yang di terbitkan.\n" +
                "\n" +
                "Mengkaji ayat-ayat al-Qur'an secara komprehensif, lengkap, dan mencangkup aspek yang dibutuhkan pembaca. Kandungan tafsir pada setiap surahnya dibuat secara global dan menggabungkan dua metode bil ma'''tsur dan bil ma'''qul. Dilengkapi dengan rincian pembahasan, seperti penamaan surah, penyesuaian dengan surah sebelumnya, kandungan surah, keutamaan surah, qiraat, i'''rab, balaghah, mufradaat lughawiyyah, sebab turunnya ayat, tafsir dan penjelasan, fiqih kehidupan atau hukum-hukumnya.",
        "Sayyid Quthb merampungkan tafsir ini di dalam penjara selama kurun waktu lebih dari sepuluh tahun, kemudian mengakhiri hidupnya di tiang gantungan sebagai syahid. Ia membayar keyakinannya dengan darahnya. Dan tafsir ini adalah lukisan keyakinannya. Ia adalah tafsir iman atas Al-Qur'an, kata adiknya, Muhammad Quthb" +
                "Tafsir ini membawa kita tenggelam sambil menyelami ilmu dan hikmah yang ada di dalam Al-Qur’an dengan penuh kenikmatan yang tidak mungkin digambarkan dengan kata-kata.\n" +
                "Mengikat dan merajut ayat-ayat Al-Qur’an dengan Hadits Rasul Saw. serta Sirah Nabawiyah dan para Sahabatnya, kemudian dikaitkan dengan sitausi dan kondisi kekinian (waqi’).\n" +
                "Kekuatan membangkitkan keyakinan (keimanan), optimisme pada rahmat dan pertolongan Allah dan rasa percaya diri sebagai umat terbaik yang Allah hadirkan ke atas bumi ini.\n" +
                "Menggugah pikiran dan perasaan kita sehingga muncul berbagai inspirasi, ide, gagasan dan berbagai pertanyaan yang paralel dengan situasi dan kondisi yang kita lewati sekarang, sehingga kita memahami dengan tepat situasi dan kondisi tersebut dengan ide solusi yang jelas pula.\n" +
                "Pencerahan yang luar biasa terkait hakikat Tuhan, manusia, kehidupan dunia, alam semesta, kehidupan akhirat, jahiliyah dan Islam.\n" +
                "Penelaahan yang sangat luar biasa dalam hal hakikat Islam dan Jahiliyah, iman dan kufur, serta keunggulan manhaj (konsep) Islam dibandingkan dengan konsep jahiliyah, baik dulu maupun yang ada sekarang yang datang dari Barat maupun Timur.\n" +
                "Bahasa yang digunakan karena Sayyid Qutb memang terkenal sebagai seorang penyair kawakan di zamannya dan bahkan beberapa syairnya sampai hari ini belum terkalahkan",
        "Tafsir Al-Jalalain merupakan kitab tafsir Al-Qur'an yang sangat terkenal di seantero Dunia Islam. Kitab tafsir klasik Sunni ini awalnya disusun oleh Jalaluddin Al-Mahalli pada tahun 1459 M. Kemudian dilanjutkan oleh muridnya, Jalaluddin As-Suyuthi pada tahun 1505 M. Sebagai penyempurnaan, edisi terjemahan ini dilengkapi dengan catatan Dr. Muhammad Al-Khumayyis, yang dicantumkan sebagai pengantar buku ini.\n" +
                "\n" +
                "Tafsir Al-Jalalain adalah kitab fenomenal dalam perjalanan sejarah keilmuan Islamf khususnya dalam bidang Ilmu Tafsir. Kelugasan bahasa dan metode penyampaiannya yang sederhana tidak menghalangi ketermasyhuran kitab ini di tengah-tengah karya-karya ulama yang mendalam dan luas keilmuannya.Tafsir ini diakui oleh kalangan ulama sebagai tafsir yang sangat banyak memberikan manfaat.\n" +
                "\n" +
                "Metode sekaligus keistimewaan kitab tafsir ini antara lain:\n" +
                "    menjelaskan makna-makna dari setiap ayat Al-Qur'an,\n" +
                "    bersandar hanya kepada riwayat yang paling kuat,\n" +
                "    memberikan catatan tentang kedudukan kalimat yang dibutuhkan,\n" +
                "    memberikan penjelasan tentang perbedaan qira'at di tempat-tempat\n" +
                "yang terdapat perbedaan berdasarkan qira'at yang terkenal.\n" +
                "    menghindarkan dari bertele-tele dalam penjelasan sehingga dalam uraian yang ada benar-benar ungkapan yang dipilih secara cermat dan tepat.\n" +
                "\n" +
                "Keistimewaan lain dari Tafsir Al-Jalalain adalah tidak ditemukan adanya perbedaan pada gaya penafsiran, meski kitab ini ditulis oleh dua orang pakar yang berbeda. Ada ulama yang meneliti bahwa perbedaan yang dapat ditemukan hanyalah kurang dari sepulul/tempat dari semua uraian tafsir yang memuat 30 juz dari Al-Qur'an. Ini menunjukkan ketepatan dan kecermatan yang luar biasa, baik dari Al-Mahalli maupun As-Suyuthi.",
        "Bagi manusia, al Qur’an itu sebagai petunjuk (huda) dan sebagai pembeda (furqon). Dengan al Qur’an itulah manusia bisa membedakan antara haq dan yang bathil. Selanjutnya manusialah yang memilih untuk mengimani dan mengikutinya atau mengingkari dan menolaknya. Bagi manusia yang mengimani dan mengamalkannya maka hidupnya akan lurus dan berada dalam ridha-Nya. Sebaliknya siapa pun yang mengingkari dan menolak serta meninggalkan al Qur’an maka dia akan tersesat dan sengsara.\n" +
                "Untuk mengamalkan al Qur’an dengan benar, mutlak diperlukan pemahaman yang benar terhadap makna dan kandungannya. Penjelasannya dan penafsiran mengenai makna serta kandungan al Qur’an yang disampaikan oleh mufassirin yang memiliki kemampuan dan penguasaan ilmu telah berhasil mengungkap banyak hal tentang makna dan kandungan al Qur’an secara tepat.\n" +
                "Namun, saat ini banyak musuh-musuh Islam yang menafsirkan al Qur’an sesuai kepentingannya, yakni untuk melanggengkan penjajahan. Mereka juga ingin menjauhkan umat dari pemahaman Islam yang benar.\n" +
                "Buku ini berbeda dengan tafsir yang lain, karena mengungkap makna dan kandungan al Qur’an dalam sudut pandang ideologis yang dihimpun dari pendapat para ahli (mufassirin) yang lurus. Sekaligus mengungkap dan menunjukkan kesalahan kaum liberal dan musuh-musuh Islam dalam menafsirkan al Qur’an.\n" +
                "Kiranya buku ini dapat mengisi kekosongan pandangan ideologis dan memberikan gambaran yang jelas akan makna dan kandungan al Qur’an yang lurus tanpa ada kepentingan dan pesanan musuh-musuh Islam. Semoga.\n" +
                "Kuantitas Tafsir Al Waie Juz Amma\n" +
                "1\n",
        "Tidak ada manusia yang sisi kehidupannya ditulis demikian detil oleh banyak orang selain Rasulullah SAW. Berbagai karya agung para ulama telah lahir untuk menuliskan manusia agung ini. Mulai dari peribadatan, akhlak, kepemimpinan dan tentu saja kronologis kehidupannya yang disebut sebagai Kitab Sirah.\n" +
                "\n" +
                "Namun demikian buku yang mengungkap sisi perjuangan dakwah Rasulullah dengan pendekatan analisa politis amat langka. Padahal Beliau adalah sosok pengemban dakwah yang berjuang melawan sistem jahiliyah yang berlaku kala itu. Kiprah dakwah dan perjuangan Beliau tidak lepas dari perjuangan politik. Berbagai ayat al-Qur`an yang turun dan juga sunnah mengkonfirmasi pada kita bila Beliau melakukan aktivitas politik dalam menegakkan Islam.\n" +
                "\n" +
                "Inilah yang menjadi keunikan buku karya Prof DR. Muhammad Rawwas Qal'ahji dibandingkan berbagai buku Sirah yang telah ada. Sang penulis memberikan analisa politik atas berbagai langkah dakwah yang dijalankan sang Nabi. Sehingga umat punya gambaran yang utuh dari kiprah dakwah dan perjuangan sang Nabi. Sehingga tak ada lagi pernyataan bahwa Islam terpisah dari politik, dan politik bukanlah bagian dari Islam. Faktanya, Rasulullah SAW. melakukan aktivitas politik untuk kemuliaan dien ini.",
        "Sebuah karya Imam al-Waqidi (w 207 H). Beliau ahli sejarah Islam terawal dan di antara yang terpopuler. Karyanya telah dinukil oleh Ibnu Sa’ad dalam kitab ‘Thabaqat al-Qubro’. Demikian halnya Imam At-Thabari juga mengutip dari Al-Waqidi. Imam Ahmad bin Hambal mengatakan, “Sesungguhnya dia orang yang mengetahui betul tentang peperangan”.\n" +
                "Terlepas dari kekurangannya (khususnya di akhir hayatnya), al-Waqidi dengan karyanya Al-Maghazi ini tidak tergantikan. Buku ini telah melegenda, menjadi rujukan utama untuk mengkaji Sirah Rasulullah SAW berkaitan dengan peperangan/maghazi beliau. Di dalamnya menyajikan secara lengkap, rinci dan mendetail setiap episode peperangan Rasulullah SAW. Selamat menikmati mahakarya beliau",
        "Paham nasionalisme seperti sebuah pemikiran yang wajib untuk diterima oleh kaum muslimin pada hari ini. Ia sudah dianggap laksana ajaran Islam yang datang dari Kitabullah & Sunnah Rasulullah.\n" +
                "\n" +
                "Padahal paham ini justru datang dari masa kegelapan yang kemudian dihapus oleh Islam untuk diganti dengan ikatan akidah; ukhuwah Islamiyyah. Akidah Islam yang bisa menyatukan semua umat manusia dari berbagai suku bangsa dalam sebuah wadah persatuan yang agung dan kokoh.\n" +
                "\n" +
                "Kaum kolonialislah yang menghidupkan kembali paham kesukuan dan kedaerahan ini. Tujuannya jelas; melumpuhkan umat dan menghalangi bersatunya mereka kembali.\n" +
                "\n" +
                "Buku kecil ini berisi sejarah penghancuran umat Islam dan cara kaum imperialis mengerat-ngerat mereka ke dalam nation state yang lemah dan tak berdaya.\n" +
                "\n" +
                "Kuantitas Sejarah Nasionalisme di Dunia Islam\n" +
                "1\n",
        "Tidak bisa dibayangkan, apa yang akan terjadi jika ruh dakwah sudah hilang di dalam jiwa kaum Muslimin, maka al-Fasad akan semakin merajalela. Kewajiban yang sudah menyatu dengan keinginan berdakwah itu harus terus senantiasa menggelora di dada kaum Muslim di seluruh penjuru dunia. Untuk itulah, pada kesempatan kali ini; gelora semangat dan keberanian para pendakwah itu terwadahi secara apik dibuku ini.\n" +
                "\n" +
                "Berawal dari audisi penulisan yang bertajuk NBR (Nulis Bareng Rombongan) yang diketuai oleh Ibu Nur Maulidiyah, maka terhimpunlah ceritak asyik, unik dan heroik, utamanya tentang dakwah. Himpunan cerita itu kemudian menjadi lebih asyik, ketika dikumpulkan dari penulis yang berdakwah diluar negeri. Ada yang mengisahkan dakwahnya di Jepang. Ada pula yang bercerita kesulitan dakwah di Qatar, Mesir, Australia, dan Amerika. Berikut beberapa judul dan penulisnya di dalam buku ini:\n" +
                "\n" +
                "    Nyala Dakwah di Negeri Paman, oleh Sam Rizky Damayanti Muhajar;\n" +
                "    Melawan Misionaris Jepang, oelh Gilig Pradhana;\n" +
                "    Gencarnya Misionaris Taiwan, oleh Nur Maulidiyah;\n" +
                "    Merintis TPA di Negeri Sakura, oleh Meinilwita Yulia;\n" +
                "Dan beberapa penulis lain yang juga menuliskan nyala dan nyali dakwahnya. Seprti ada Emma Kaze, Ice Tianiza, Rindyanati Septiana, Alga Biru, Aqila Fikriyya, Anjar Rosyitawati, Dian Auliya, Caca Anastasya, dan Kavana el-Kava.\n" +
                "\n" +
                "Kisah hanya akan jadi kisah jika tak pandai menuai hikmah. Kisah dakwah nan indah dan penuh hikmah telah dirangkai oleh Ibu Nur Maulidiyah dan para Ikhwah. Semoga persembahan buku ini menjadi berkah. Dan bagi dakwah, semoga buku ini jadi sinergi ukhuwah, untuk selalu Istiqamah dijalan dakwah.",
        "Allah SWT telah menciptakan manusia dengan sebaik-baik ciptaan. Diri manusia dihiasi dengan berbagai karakteristik yang menjadi potensi kehidupannya. Di antara potensi kehidupan tersebut adalah dihiasinya manusia dengan berbagai kebutuhan dalam rangka mempertahankan hidup yaitu berupa hajah al udlowiyah/kebutuhan untuk hidup.\n" +
                "\n" +
                "Karena adanya hajah al udlowiyah inilah manusia perlu makan, minum, perlu istirahat, perlu bernapas, perlu buang hajat dan sebagainya. Manusia dihiasi pula dengan ghara’iz (naluri-naluri) berupa gharizah at-tadayyun (naluri beragama), gharizah al-baqa’ (naluri mempertahankan diri) dan gharizah an-naw’ (naluri untuk mempertahankan jenis). Di atas karunia berupa gharizah an-naw’ inilah Allah SWT menyandarkan kelangsungan jenis manusia di muka bumi.\n" +
                "\n" +
                "Salah satu bentuk dari dorongan gharizah an-naw’ ini adalah rasa kasih, sayang dan cinta pada keluarga, serta usaha dalam membentuk keluarga sakinah, mawaddah wa rahmah dalam bingkai pernikahan yang barakah.\n" +
                "\n" +
                "Dalam buku ini, penulis dengan cermat menuliskan sebuah konsep dalam mewujudkan sebuah jalan menuju pernikahan yang barakah, sejak ‘azam itu muncul, hingga proses khitbah, memilih calon pasangan, tata cara menimbang, dan lain-lain.\n" +
                "\n" +
                "Dalam buku ini pula, terlihat bahwa penulis benar-benar menginginkan mewujudnya sebuah keluarga muslim yang kukuh, berpegang teguh pada nilai-nilai syariat, sebuah keluarga muslim ideologis. Selamat membaca",
    )

    private val author = arrayOf(
        "Dr. Shalah Abdul Fattah al-Khalidi",
        "Hamka",
        "Prof. Dr. Wahbah Az-Zuhaili",
        "Sayyid Quthb",
        "Jalaluddin Al-Mahalli & Jalaluddin As-Suyuti",
        "KH. Rokhmat S Labib",
        "Prof. Dr. Muhammad Rawwas Qal'''ahji",
        "Imam Al Waqidi",
        "Shabir Ahmed dan Abid Karim",
        "Nur Maulidiyah, Dkk",
        "Yahya Abdurrahman"
    )

    private  val publisher = arrayOf(
        "Maghfiroh Pustaka",
        "Gema Insani Press",
        "Gema Insani Press",
        "Robbani Press",
        "Ummul Quro",
        "Al Azhar Fresszone",
        "Al Azhar Press",
        "Al Azhar Fresszone",
        "Al Azhar Fresszone",
        "Al Azhar Fresszone",
        "Al Azhar Press"
    )

    private val publish_year = arrayOf(
        2009, 2018, 2016, 2000, 2018, 2020, 2020, 2015, 2018, 2013, 2017
    )

    private val cover_img = intArrayOf(R.drawable.tafsir_ibnu_katsir,
        R.drawable.tafsir_al_azhar_hamka,
        R.drawable.tafsir_al_munir,
        R.drawable.tafsir_fi_zhilalil,
        R.drawable.tafsir_jalallain,
        R.drawable.tafsir_alwaie_juz_amma,
        R.drawable.sirah_nabawiyah,
        R.drawable.al_maghazi,
        R.drawable.sejarah_nasionalisme,
        R.drawable.nyali_nyali_dakwah,
        R.drawable.risalah_khitbah
    )

    private val url = arrayOf(
        "https://www.gramedia.com/api/amp/product/mudah-tafsir-ibnu-katsir-jilid/",
        "https://toko-muslim.com/buku-tafsir-al-azhar-hamka-1-set-9-jilid/",
        "https://shopee.co.id/Tafsir-Al-Munir-15-Jilid-1-Set-Karya-Prof-Dr-Wahbah-AzZuhaili-i.57722139.1471574288",
        "http://www.fatahillahstan.com/Tafsir-Fi-Zhilalil-Qur-an-1-Set.html",
        "https://www.bukukita.com/Agama/Islam/159351-TAFSIR-JALALAIN.html",
        "https://al-azharpress.com/produk/tafsir-al-waie-juz-amma/",
        "https://al-azharpress.com/produk/sirah-nabawiyah-sisi-politis-perjuangan-rasulullah-saw/",
        "https://al-azharpress.com/produk/al-maghazi/",
        "https://al-azharpress.com/produk/sejarah-nasionalisme-di-dunia-islam/",
        "https://al-azharpress.com/produk/nyala-nyali-dakwah-di-penjuru-negeri/",
        "https://al-azharpress.com/produk/risalah-khitbah/"
    )

    val listData : ArrayList<Book>
        get(){
            val list = arrayListOf<Book>()
            for (position in title.indices){
                val book = Book()
                book.title = title[position]
                book.author = author[position]
                book.detail = detail[position]
                book.img_cover = cover_img[position]
                book.publiser = publisher[position]
                book.publish_year = publish_year[position]
                book.url = url[position]
                list.add(book)
            }
            return list
        }
}