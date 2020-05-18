/* 
 * slf-4-mc
 * Copyright © 2020 Anand Beh <https://www.arim.space>
 * 
 * slf-4-mc is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * slf-4-mc is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with slf-4-mc. If not, see <https://www.gnu.org/licenses/>
 * and navigate to version 3 of the GNU General Public License.
 */
package space.arim.slf4mc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.md_5.bungee.api.plugin.Plugin;

public class Slf4Bungee extends Plugin {

	@Override
	public void onLoad() {
		try {
			Logger logger = getSLF4JLogger();
			logger.error("----------------------------------------------------------------");
			logger.error("Uninstall Slf4MC because your server already has slf4j!");
			logger.error("----------------------------------------------------------------");
		} catch (NoSuchMethodError expected) {
			LoggerFactory.getLogger(Slf4Spigot.class).info("Hello from slf4j!");
		}
	}

}
