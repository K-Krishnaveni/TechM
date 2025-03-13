import 'package:flutter/material.dart';
import 'package:flutterthemesetting/services/database_helper.dart';

class SavedThemesPage extends StatefulWidget {
  final Function(String) onBackgroundChanged;

  const SavedThemesPage({super.key, required this.onBackgroundChanged});

  @override
  _SavedThemesPageState createState() => _SavedThemesPageState();
}

class _SavedThemesPageState extends State<SavedThemesPage> {
  List<String> savedThemes = [];

  @override
  void initState() {
    super.initState();
    _loadSavedThemes();
  }

  Future<void> _loadSavedThemes() async {
    List<String> themes = await DatabaseHelper().getSavedThemes();
    setState(() {
      savedThemes = themes;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Saved Themes")),
      body: savedThemes.isEmpty
          ? Center(child: Text("No saved themes yet!"))
          : ListView.builder(
              itemCount: savedThemes.length,
              itemBuilder: (context, index) {
                String theme = savedThemes[index];
                bool isImage = theme.startsWith("http");

                return ListTile(
                  leading: isImage
                      ? Image.network(theme, width: 50, height: 50, fit: BoxFit.cover)
                      : CircleAvatar(backgroundColor: _getColorFromName(theme)),
                  title: Text(isImage ? "Image Theme" : "Color Theme"),
                  subtitle: Text(theme),
                  onTap: () {
                    widget.onBackgroundChanged(theme);
                    Navigator.pop(context);
                  },
                );
              },
            ),
    );
  }

  Color _getColorFromName(String colorName) {
    if (colorName.startsWith('#')) {
      return Color(int.parse(colorName.replaceFirst('#', '0xff')));
    }
    switch (colorName.toLowerCase()) {
      case 'red': return Colors.redAccent;
      case 'blue': return Colors.blueAccent;
      case 'green': return Colors.greenAccent;
      case 'yellow': return Colors.yellowAccent;
      case 'black': return Colors.black87;
      default: return Colors.white;
    }
  }
}
