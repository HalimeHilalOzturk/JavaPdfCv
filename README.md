* {
    box-sizing: border-box;
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
}

body {
    background-color: #f4f4f4;
    color: #333;
}

/* Üst Başlık */
.header {
    background-color: #7b5299;
    color: white;
    text-align: center;
    padding: 25px 10px;
}

.header h1 {
    font-size: 24px;
    margin-bottom: 5px;
}

.header p {
    font-size: 14px;
}

/* Navigasyon */
.navbar {
    background-color: #554455;
}

.navbar ul {
    list-style: none;
    display: flex;
    flex-wrap: wrap;
    padding-left: 20px;
}

.navbar li a {
    display: block;
    color: white;
    padding: 12px 15px;
    text-decoration: none;
    font-size: 14px;
}

.navbar li a:hover {
    background-color: #443344;
}

/* Konteyner */
.container {
    max-width: 1100px;
    margin: 20px auto;
    padding: 0 15px;
}

/* Banner Alanı - Fotoğrafın tamamı görünecek şekilde ayarlandı */
.banner {
    background: url('PHOTO-2026-10-14-10-53-23.jpg') no-repeat center center;
    background-size: contain;
    background-color: #222;
    height: 300px;
    border-radius: 4px;
    position: relative;
    margin-bottom: 20px;
    border: 1px solid #ccc;
}

.banner-content {
    position: absolute;
    top: 20px;
    right: 20px;
}

.btn {
    background-color: #d9534f;
    color: white;
    border: none;
    padding: 8px 15px;
    border-radius: 4px;
    cursor: pointer;
    font-weight: bold;
}

/* Üç Sütunlu Yapı (Flexbox) */
.main-grid {
    display: flex;
    gap: 20px;
}

/* Sütunlar */
.categories {
    flex: 1;
    background-color: #d4edbc;
    border: 1px solid #a8d58a;
    padding: 15px;
    border-radius: 4px;
}

.content {
    flex: 2.5;
    display: flex;
    flex-direction: column;
    gap: 15px;
}

.post {
    background-color: white;
    border: 1px solid #ccc;
    padding: 15px;
    border-radius: 4px;
}

.post h2 {
    font-size: 18px;
    color: #333;
    margin-bottom: 8px;
}

.post p {
    font-size: 13px;
    color: #666;
    line-height: 1.4;
}

.announcements {
    flex: 1;
    background-color: white;
    border: 1px solid #ccc;
    padding: 15px;
    border-radius: 4px;
}

/* Yan Menü Başlık ve Listeler */
.sidebar h3, .announcements h3 {
    font-size: 16px;
    margin-bottom: 10px;
    color: #222;
    border-bottom: 1px solid #ddd;
    padding-bottom: 5px;
}

.categories ul {
    list-style: none;
    padding-left: 10px;
}

.categories li {
    font-size: 13px;
    margin-bottom: 8px;
    position: relative;
    padding-left: 12px;
}

.categories li::before {
    content: "•";
    position: absolute;
    left: 0;
    color: #333;
}

.announcements p {
    font-size: 13px;
    color: #555;
    line-height: 1.4;
}

/* Footer */
.footer {
    text-align: center;
    padding: 15px;
    background-color: #ddd;
    font-size: 12px;
    color: #555;
    margin-top: 30px;
}

/* Responsive Düzen */
@media (max-width: 768px) {
    .main-grid {
        flex-direction: column;
    }
    
    .navbar ul {
        padding-left: 0;
        justify-content: center;
    }
}
