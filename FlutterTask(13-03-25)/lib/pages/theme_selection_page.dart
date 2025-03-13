import 'package:flutter/material.dart';

class ThemeSelectionPage extends StatefulWidget {
  final Function(String) onBackgroundChanged;
  const ThemeSelectionPage({super.key, required this.onBackgroundChanged});

  @override
  _ThemeSelectionPageState createState() => _ThemeSelectionPageState();
}

class _ThemeSelectionPageState extends State<ThemeSelectionPage> {
  final TextEditingController _colorController = TextEditingController();
  final TextEditingController _imageController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text("Choose a theme that speaks to you!")),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            _buildColorTile("Red", Colors.redAccent),
            _buildColorTile("Blue", Colors.blueAccent),
            _buildColorTile("Green", Colors.greenAccent),
            _buildColorTile("Yellow", Colors.yellowAccent),
            _buildColorTile("Black", Colors.black87),
            Divider(),
            Text("Add Custom Color (HEX Code)"),
            TextField(
              controller: _colorController,
              decoration: InputDecoration(hintText: "Enter HEX code (e.g., #ff5733)"),
            ),
            ElevatedButton(
              onPressed: () {
                widget.onBackgroundChanged(_colorController.text.trim());
                Navigator.pop(context);
              },
              child: Text("Set Custom Color"),
            ),
            Divider(),
            Text("Add Image as Background"),
            TextField(
              controller: _imageController,
              decoration: InputDecoration(hintText: "Enter Image URL"),
            ),
            ElevatedButton(
              onPressed: () {
                widget.onBackgroundChanged(_imageController.text.trim());
                Navigator.pop(context);
              },
              child: Text("Set Image Background"),
            ),
          ],
        ),
      ),
    );
  }

  Widget _buildColorTile(String colorName, Color color) {
    return ListTile(
      title: Text(colorName),
      leading: CircleAvatar(backgroundColor: color),
      onTap: () {
        widget.onBackgroundChanged(colorName.toLowerCase());
        Navigator.pop(context);
      },
    );
  }
}
