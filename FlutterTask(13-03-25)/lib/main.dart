import 'package:flutter/material.dart';
import 'package:flutterthemesetting/pages/home_page.dart';
import 'package:flutterthemesetting/services/database_helper.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
 List<String> savedThemes = await DatabaseHelper().getSavedThemes();
String savedBackground = savedThemes.isNotEmpty ? savedThemes.last : 'white';

  runApp(MyApp(bg: savedBackground));
}

class MyApp extends StatefulWidget {
  final String bg;
  const MyApp({super.key, required this.bg});

  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String currentBackground = 'white';

  void updateBackgroundColor(String newBackground) async {
    setState(() {
      currentBackground = newBackground;
    });
    await DatabaseHelper().saveTheme(newBackground);
  }

  @override
  void initState() {
    super.initState();
    currentBackground = widget.bg;
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: HomePage(onBackgroundChanged: updateBackgroundColor, bg: currentBackground),
    );
  }
}
