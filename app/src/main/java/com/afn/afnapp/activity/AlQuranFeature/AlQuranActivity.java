package com.afn.afnapp.activity.AlQuranFeature;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import com.afn.afnapp.R;
import com.afn.afnapp.adapter.SurahAdapter;
import com.afn.afnapp.model.SurahNameModel;
import com.github.paolorotolo.expandableheightlistview.ExpandableHeightListView;

import java.util.ArrayList;
import java.util.List;

public class AlQuranActivity extends AppCompatActivity {

    private com.github.paolorotolo.expandableheightlistview.ExpandableHeightListView lvSurah;

    private List<SurahNameModel> listSurah = new ArrayList<>();
    private SurahAdapter adapter;

    private String arrNamaSurahIndo[] = {
            "Al-Fatihah",
            "Al-Baqarah",
            "Ali 'Imran",
            "An-Nisa'",
            "Al-Ma'idah",
            "Al-An'am",
            "Al-A'raf",
            "Al-Anfal",
            "At-Taubah",
            "Yunus",
            "Hud",
            "Yusuf",
            "Ar-Ra'd",
            "Ibrahim",
            "Al-Hijr",
            "An-Nahl",
            "Al-Isra'",
            "Al-Kahf",
            "Maryam",
            "Ta Ha",
            "Al-Anbiya",
            "Al-Hajj",
            "Al-Mu'minun",
            "An-Nur",
            "Al-Furqan",
            "Asy-Syu'ara'",
            "An-Naml",
            "Al-Qasas",
            "Al-'Ankabut",
            "Ar-Rum",
            "Luqman",
            "As-Sajdah",
            "Al-Ahzab",
            "Saba'",
            "Fatir",
            "Ya Sin",
            "As-Saffat",
            "Shad",
            "Az-Zumar",
            "Al-Mu'min",
            "Fussilat",
            "Asy-Syura",
            "Az-Zukhruf",
            "Ad-Dukhan",
            "Al-Jasiyah",
            "Al-Ahqaf",
            "Muhammad",
            "Al-Fath",
            "Al-Hujurat",
            "Qaf",
            "Adz-Dzariyat",
            "At-Tur",
            "An-Najm",
            "Al-Qamar",
            "Ar-Rahman",
            "Al-Waqi'ah",
            "Al-Hadid",
            "Al-Mujadilah",
            "Al-Hasyr",
            "Al-Mumtahanah",
            "As-Saff",
            "Al-Jumu'ah",
            "Al-Munafiqun",
            "At-Taghabun",
            "At-Talaq",
            "At-Tahrim",
            "Al-Mulk",
            "Al-Qalam",
            "Al-Haqqah",
            "Al-Ma'arij",
            "Nuh",
            "Al-Jinn",
            "Al-Muzzammil",
            "Al-Muddassir",
            "Al-Qiyamah",
            "Al-Insan",
            "Al-Mursalat",
            "An-Naba'",
            "An-Nazi'at",
            "'Abasa",
            "At-Takwir",
            "Al-Infitar",
            "Al-Muthaffifin",
            "Al-Insyiqaq",
            "Al-Buruj",
            "At-Tariq",
            "Al-A'la",
            "Al-Ghasyiah",
            "Al-Fajr",
            "Al-Balad",
            "Asy-Syams",
            "Al-Lail",
            "Ad-Dhuha",
            "Al-Insyirah",
            "At-Tin",
            "Al-'Alaq",
            "Al-Qadr",
            "Al-Bayyinah",
            "Al-Zalzalah",
            "Al-'Adiyat",
            "Al-Qari'ah",
            "At-Takatsur",
            "Al-'Asr",
            "Al-Humazah",
            "Al-Fiil",
            "Quraisy",
            "Al-Ma'un",
            "Al-Kautsar",
            "Al-Kafirun",
            "An-Nasr",
            "Al-Lahab",
            "Al-Ikhlas",
            "Al-Falaq",
            "An-Nas",
    };

    private String arrNamaSurah[] = {"سورة الفاتحة",
            "سورة البقرة",
            "سورة آل عمران",
            "سورة النساء",
            "سورة المائدة",
            "سورة الأنعام",
            "سورة الأعراف",
            "سورة الأنفال",
            "سورة التوبة",
            "سورة يونس",
            "سورة هود",
            "سورة يوسف",
            "سورة الرعد",
            "سورة إبراهيم",
            "سورة الحجر",
            "سورة النحل",
            "سورة الإسراء",
            "سورة الكهف",
            "سورة مريم",
            "سورة طه",
            "سورة الأنبياء",
            "سورة الحج",
            "سورة المؤمنون",
            "سورة النور",
            "سورة الفرقان",
            "سورة الشعراء",
            "سورة النمل",
            "سورة القصص",
            "سورة العنكبوت",
            "سورة الروم",
            "سورة لقمان",
            "سورة السجدة",
            "سورة الأحزاب",
            "سورة سبأ",
            "سورة فاطر",
            "سورة يس",
            "سورة الصافات",
            "سورة ص",
            "سورة الزمر",
            "سورة غافر",
            "سورة فصلت",
            "سورة الشورى",
            "سورة الزخرف",
            "سورة الدخان",
            "سورة الجاثية",
            "سورة الأحقاف",
            "سورة محمد",
            "سورة الفتح",
            "سورة الحجرات",
            "سورة ق",
            "سورة الذاريات",
            "سورة الطور",
            "سورة النجم",
            "سورة القمر",
            "سورة الرحمن",
            "سورة الواقعة",
            "سورة الحديد",
            "سورة المجادلة",
            "سورة الحشر",
            "سورة الممتحنة",
            "سورة الصف",
            "سورة الجمعة",
            "سورة المنافقون",
            "سورة التغابن",
            "سورة الطلاق",
            "سورة التحريم",
            "سورة الملك",
            "سورة القلم",
            "سورة الحاقة",
            "سورة المعارج",
            "سورة نوح",
            "سورة الجن",
            "سورة المزمل",
            "سورة المدثر",
            "سورة القيامة",
            "سورة الإنسان",
            "سورة المرسلات",
            "سورة النبأ",
            "سورة النازعات",
            "سورة عبس",
            "سورة التكوير",
            "سورة الإنفطار",
            "سورة المطففين",
            "سورة الانشقاق",
            "سورة البروج",
            "سورة الطارق",
            "سورة الأعلى",
            "سورة الغاشية",
            "سورة الفجر",
            "سورة البلد",
            "سورة الشمس",
            "سورة الليل",
            "سورة الضحى",
            "سورة الشرح",
            "سورة التين",
            "سورة العلق",
            "سورة القدر",
            "سورة البينة",
            "سورة الزلزلة",
            "سورة العاديات",
            "سورة القارعة",
            "سورة التكاثر",
            "سورة العصر",
            "سورة الهمزة",
            "سورة الفيل",
            "سورة قريش",
            "سورة الماعون",
            "سورة الكوثر",
            "سورة الكافرون",
            "سورة النصر",
            "سورة المسد",
            "سورة الإخلاص",
            "سورة الفلق",
            "سورة الناس"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_quran);

        adapter = new SurahAdapter(this, listSurah);
        adapter.notifyDataSetChanged();

        setLayout();
        setKlik();
        tampilkanNamaSurah();
    }


    void setLayout() {
        this.lvSurah = (ExpandableHeightListView) findViewById(R.id.lvSurah);

        this.lvSurah.setExpanded(true);
    }

    void setKlik() {
        lvSurah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SurahNameModel sm = listSurah.get(position);
                Intent i = new Intent(AlQuranActivity.this, IsiDariSurahActivity.class);
                i.putExtra("noSurah", sm.getNoSurah());
                i.putExtra("namaSurah", sm.getNameSurah());
                i.putExtra("namaSurahIndo",arrNamaSurahIndo[0]);
                startActivity(i);
            }
        });
    }

    void tampilkanNamaSurah() {
        listSurah.clear();
        for (int i = 0; i < arrNamaSurah.length; i++) {
            SurahNameModel ss = new SurahNameModel();
            ss.setNoSurah(i + 1);
            ss.setNameSurah(arrNamaSurah[i]);
            ss.setNameSurahIndo(arrNamaSurahIndo[i]);
            listSurah.add(ss);
        }
        lvSurah.setAdapter(adapter);
    }
}
