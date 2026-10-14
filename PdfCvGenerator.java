import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class PdfCvGenerator {

    public void generatePdf(UserProfile profile, String outputPath) {
        Document document = new Document(PageSize.A4, 36, 36, 36, 36);

        try {
            PdfWriter.getInstance(document, new FileOutputStream(outputPath));
            document.open();

            // Profil Resmi Ekleme
            try {
                Image img = Image.getInstance(profile.getImagePath());
                img.scaleToFit(100, 100);
                img.setAlignment(Element.ALIGN_RIGHT);
                document.add(img);
            } catch (Exception e) {
                System.out.println("Resim eklenemedi, resimsiz devam ediliyor: " + e.getMessage());
            }

            // Başlık & İletişim Bilgileri
            Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 20, BaseColor.DARK_GRAY);
            Font subTitleFont = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.GRAY);
            Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, BaseColor.BLACK);
            Font bodyFont = FontFactory.getFont(FontFactory.HELVETICA, 10, BaseColor.BLACK);

            document.add(new Paragraph(profile.getFullName(), titleFont));
            document.add(new Paragraph(profile.getTitle(), subTitleFont));
            document.add(new Paragraph("E-posta: " + profile.getEmail() + " | Tel: " + profile.getPhone(), bodyFont));
            document.add(new Paragraph("\n---------------------------------------------------------------------------------------------------\n"));

            // İş Deneyimleri Başlığı
            Paragraph expHeader = new Paragraph("Is Deneyimleri", headerFont);
            expHeader.setSpacingAfter(10);
            document.add(expHeader);

            // 3 Adet İş Deneyimini Listeleme
            for (Experience exp : profile.getExperiences()) {
                Paragraph pComp = new Paragraph(exp.getTitle() + " - " + exp.getCompany() + " (" + exp.getDuration() + ")", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 11));
                Paragraph pDesc = new Paragraph(exp.getDescription(), bodyFont);
                pDesc.setSpacingAfter(8);

                document.add(pComp);
                document.add(pDesc);
            }

            document.close();
            System.out.println("PDF CV başarıyla üretildi: " + outputPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}