import 'package:sqflite/sqflite.dart';
import 'package:path/path.dart';

class DatabaseHelper {
  static final DatabaseHelper _instance = DatabaseHelper._internal();
  factory DatabaseHelper() => _instance;
  static Database? _database;

  DatabaseHelper._internal();

Future<Database> get database async {
    if (_database != null) return _database!;
    _database = await _initDatabase();
    return _database!;
  }

  Future<Database> _initDatabase() async {
    String path = join(await getDatabasesPath(), 'theme_database.db');
    return await openDatabase(
      path,
      version: 1,
      onCreate: (db, version) async {
        await db.execute(
            'CREATE TABLE theme (id INTEGER PRIMARY KEY, background TEXT)');
      },
    );
  }

  Future<void> saveTheme(String bg) async {
    final db = await database;
    await db.insert("theme", {'background': bg});
  }

  Future<List<String>> getSavedThemes() async {
    final db = await database;
    final List<Map<String, dynamic>> result = await db.query("theme");
    return result.map((e) => e["background"] as String).toList();
  }
}