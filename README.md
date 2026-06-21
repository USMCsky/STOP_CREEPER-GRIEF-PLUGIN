# SKY-GRIEFERS (Spigot Plugin)

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://adoptium.net/)
[![Spigot API](https://img.shields.io/badge/Spigot%20API-1.21-blue.svg)](https://www.spigotmc.org/wiki/spigot-plugin-development/)
[![Last Commit](https://img.shields.io/github/last-commit/USMCsky/SKY-GRIEFERS)](https://github.com/USMCsky/SKY-GRIEFERS/commits/master)
[![Repo Size](https://img.shields.io/github/repo-size/USMCsky/SKY-GRIEFERS)](https://github.com/USMCsky/SKY-GRIEFERS)
[![Author](https://img.shields.io/badge/Author-USMCsky-00bcd4.svg)](https://github.com/USMCsky)

A lightweight Spigot plugin that reduces grief-related frustration by:
- preventing Creepers from causing property/block damage, and
- removing Phantoms from normal gameplay.

Great for survival servers that want less destructive mob behavior while keeping core gameplay intact.

## Features
- **No Creeper block damage**  
  Creeper explosions still occur, but terrain/structures are protected.
- **Phantoms removed**  
  Phantom spawning is disabled/blocked for a calmer survival experience.
- Lightweight, Spigot-native Java plugin
- No external dependencies (Spigot API only)
- Automatic—no configuration or commands required

## Requirements
- **Minecraft/Spigot API:** `1.21`
- **Java:** 21
- **Build Tool:** Maven

## Installation
1. Build or download the plugin `.jar`.
2. Place the `.jar` into your server's `plugins/` folder.
3. Start or restart your Spigot/Paper server.
4. Plugin loads automatically with no additional setup.

## How It Works
SKY-GRIEFERS uses Spigot event listeners to:
1. **Block Creeper explosions** – intercepts `EntityExplodeEvent` and cancels block damage while preserving entity effects.
2. **Prevent Phantom spawning** – intercepts `CreatureSpawnEvent` and blocks Phantom entities from spawning.

## Troubleshooting
- **Creepers still break blocks**
  - Confirm this plugin is loaded on startup (check console logs).
  - Check for other plugins that alter explosion behavior (may conflict).
  - Restart the server to ensure plugin is active.

- **Phantoms still appear**
  - Check for other plugins or datapacks that force phantom spawns.
  - Confirm plugin loaded without errors at startup.
  - Verify no other plugins are overriding spawn behavior.

- **Build fails**
  - Ensure Maven is installed and `JAVA_HOME` targets Java 21.
  - Run: `mvn -X clean package` for detailed logs.
