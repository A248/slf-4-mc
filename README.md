# slf-4-mc

A slf4j binding for Spigot and Bungee servers which don't have one.

## Information for Server Owners

This is intended for servers which do not already have a slf4j. Simply install the plugin; no extra configuration is needed.

**Paper 1.12.2+ servers already have a slf4j binding,** so slf-4-mc should NOT be installed on these servers.

**Waterfall proxies already have a slf4j binding,** so slf-4-mc should NOT be installed on these proxy servers.

## Information for Developers

This is a very simple plugin which could be made in a matter of minutes. It merely shades slf4j-api and slf4j-jdk14. Additionally, users who already have slf4j will be instructed to uninstall slf-4-mc. Such mishaps are detected via [Paper's JavaPlugin#getSLF4JLogger](https://github.com/PaperMC/Paper/blob/master/Spigot-API-Patches/0066-Allow-plugins-to-use-SLF4J-for-logging.patch) or [Waterfall's Plugin#getSLF4JLogger](https://github.com/PaperMC/Waterfall/blob/master/BungeeCord-Patches/0038-Allow-plugins-to-use-SLF4J-for-logging.patch).

## Notes

slf-4-mc is made as a backstop for servers which do not have slf4j, including servers using legacy versions as old as 1.7.10. Although individual Minecraft servers use log4j2 internally, this usage is not exposed to plugins. Further, it is possible that these log4j2 internals may change. Accordingly, it is insufficient to instead shade the log4j2 implementation of slf4j, log4j-slf4j-impl, to support all versions.

For these reasons, slf4mc ties to JUL, which is common to Spigot and Bungee.
