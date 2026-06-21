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

## Requirements
- **Minecraft/Spigot API:** `1.21` (recommended to match your build config)
- **Java:** 21
- **Build Tool:** Maven

### Commands
> If your plugin currently has no commands, you can remove this section.

- `/skygriefers reload`  
  Reload plugin configuration (admin, if implemented).

## Configuration
> Add your real config keys here if/when you expose settings.

Example idea:
```yaml
creeper:
  block-damage: false

phantom:
  enabled: false
```

## Build
From the project root:

```bash
mvn clean package
```

The compiled plugin `.jar` will be generated in:

```text
target/
```

## Installation
1. Build or download the plugin `.jar`.
2. Place the `.jar` into your server's `plugins/` folder.
3. Start or restart your Spigot/Paper server.
4. Edit config files (if present) in the plugin data folder.
5. Reload/restart after configuration changes.

## Troubleshooting
- **Creepers still break blocks**
  - Confirm this plugin is loaded and enabled on startup.
  - Check for other plugins that alter explosion behavior.
  - Verify config values (if configurable) and reload/restart.

- **Phantoms still appear**
  - Check for other plugins/datapacks that force phantom spawns.
  - Confirm plugin startup completed without errors.
  - Verify world-specific rules/plugins are not overriding behavior.

- **Build fails**
  - Ensure Maven is installed and `JAVA_HOME` targets Java 21.
  - Run: `mvn -X clean package` for detailed logs.

## Repository
- **GitHub:** [USMCsky/SKY-GRIEFERS](https://github.com/USMCsky/SKY-GRIEFERS)
- **Template reference:** [USMCsky/SkyMap_Spigot_Plugin](https://github.com/USMCsky/SkyMap_Spigot_Plugin)
