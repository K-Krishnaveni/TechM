import 'package:flutter/material.dart';
import 'package:flutterthemesetting/pages/theme_selection_page.dart';
import 'package:flutterthemesetting/pages/saved_themes_page.dart';
class HomePage extends StatelessWidget {
  final Function(String) onBackgroundChanged;
  final String bg;

  const HomePage({super.key, required this.onBackgroundChanged, required this.bg});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: _getColorFromName(bg), 
      body: Stack(
        children: [
          if (bg.startsWith('http')) 
            Positioned.fill(child: Image.network(bg, fit: BoxFit.cover)),
          Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text(
                " Welcome to Themes!",
                style: TextStyle(fontSize: 32, fontWeight: FontWeight.bold, color: Colors.white),
                textAlign: TextAlign.center,
              ),
              SizedBox(height: 10),
              Text(
                "Every color has a story; every theme has a meaning.",
                style: TextStyle(fontSize: 20, fontStyle: FontStyle.italic, color: Colors.white70),
                textAlign: TextAlign.center,
              ),
              SizedBox(height: 20),
              ElevatedButton(
                onPressed: () {
                  Navigator.push(
                    context,
                    MaterialPageRoute(
                      builder: (context) => ThemeSelectionPage(onBackgroundChanged: onBackgroundChanged),
                    ),
                  );
                },
                child: Text("Choose Background"),
              ),
              ElevatedButton(
              onPressed: () {
                  Navigator.push(
                    context,
                    MaterialPageRoute(builder: (context) => SavedThemesPage(onBackgroundChanged: onBackgroundChanged)),
                  );
                },
                child: Text("Saved Themes"),
            ),

            ],
          ),
        ],
      ),
    );
  }

  Color _getColorFromName(String colorName) {
    if (colorName.startsWith('#')) {
      return Color(int.parse(colorName.replaceFirst('#', '0xff')));
    }
    switch (colorName.toLowerCase()) {
      case 'red':
        return Colors.redAccent;
      case 'blue':
        return Colors.blueAccent;
      case 'green':
        return Colors.greenAccent;
      case 'yellow':
        return Colors.yellowAccent;
      case 'black':
        return Colors.black87;
      default:
        return Colors.white;
    }
  }
}
