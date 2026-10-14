public class Main {
    public static void main(String[] args) {
        // Kullanıcı Profilinin Hazırlanması
        UserProfile profile = new UserProfile(
                "Hilal",
                "Yazılım Mühendisi",
                "hilal@example.com",
                "+90 555 000 0000",
                "profile.jpg"
        );

        // Hayali 3 İş Deneyimi
        profile.addExperience(new Experience(
                "Tech Solutions A.Ş.",
                "Yazılım Geliştirici",
                "2024 - Halen",
                "Java Spring Boot mimarisi ile RESTful API geliştirme ve mikroservis yönetimi."
        ));

        profile.addExperience(new Experience(
                "Innova Bilişim",
                "Yazılım Uzman Yardımcısı",
                "2022 - 2024",
                "Nesne yönelimli sistem tasarımı ve veri tabanı optimizasyonu."
        ));

        profile.addExperience(new Experience(
                "Veri Yazılım",
                "Yazılım Stajyeri",
                "2021 - 2022",
                "Birim testlerinin yazılması ve teknik dokümantasyon hazırlanması."
        ));

        // PDF Oluşturucu Nesnesini Çağırma
        PdfCvGenerator generator = new PdfCvGenerator();
        generator.generatePdf(profile, "Hilal_CV.pdf");
    }
}