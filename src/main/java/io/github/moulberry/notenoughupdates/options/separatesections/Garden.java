/*
 * Copyright (C) 2022 NotEnoughUpdates contributors
 *
 * This file is part of NotEnoughUpdates.
 *
 * NotEnoughUpdates is free software: you can redistribute it
 * and/or modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * NotEnoughUpdates is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with NotEnoughUpdates. If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.moulberry.notenoughupdates.options.separatesections;

import com.google.gson.annotations.Expose;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorInfoText;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class Garden {
	@Expose
	@ConfigOption(
		name = "\u00a7cWarning",
		desc = "\u00a7cThis section is disabled since there is no garden in Fakepixel Skyblock."
	)
	@ConfigEditorInfoText()
	public boolean warningGarden = false;

	@Expose
	@ConfigOption(
		name = "Mute Composter",
		desc = "Mute sounds of composting"
	)
	@ConfigEditorInfoText()
	public boolean muteComposterSounds = false;

	@Expose
	@ConfigOption(
		name = "Enable Preset Delete Warning",
		desc = "Asks for confirmation when deleting a preset"
	)
	@ConfigEditorInfoText()
	public boolean presetDeleteWarning = false;

	@Expose
	@ConfigOption(
		name = "Sprayonator Cooldown",
		desc = "Show the cooldown duration of the sprayonator."
	)
	@ConfigEditorInfoText()
	public boolean sprayonatorCooldown = false;
}
