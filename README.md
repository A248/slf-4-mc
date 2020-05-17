# slf-4-mc

A slf4j binding for Spigot and Bungee servers which don't have one.

## Information for Server Owners

This is intended for servers which do not already have a slf4j. Simply install the plugin; no extra configuration is needed.

**Paper 1.12.2+ servers already have a slf4j binding,** so slf-4-mc should NOT be installed on these servers.

## Information for Developers

The slf4j binding is based on version *1.7.25* of slf4j. To ensure compatibility, one should build against this version. The slf4j is implemented in whole; note that it is marker agnostic. However, MDC *is* supported.

## Notes

slf-4-mc is made as a backstop for servers which do not have slf4j, including servers using legacy versions as old as 1.7.10. Although individual Minecraft servers use log4j2 internally, this usage is not exposed to plugins. Further, it is possible that these log4j2 internals may change. Indeed, simply shading the log4j2 implementation of slf4j, log4j-slf4j-impl, is insufficient to support all versions.

For these reasons, slf4mc ties to JUL, which is common to Spigot and Bungee. Also because of this, there is no ability to change individual logger levels, whether through JUL or log4j2. If server owners wish for better integration, configuration, or performance with regards to logging, they should use a sl4j binding native to their platform.

## License

See the file LICENSE.txt for the full GNU General Public License v3. The license applies to this entire repository and is copied into binaries as LICENSE.txt.
