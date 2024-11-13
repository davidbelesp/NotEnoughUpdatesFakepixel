/*
 * Copyright (C) 2024 NotEnoughUpdates contributors
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
import io.github.moulberry.moulconfig.annotations.ConfigAccordionId;
import io.github.moulberry.moulconfig.annotations.ConfigEditorAccordion;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class Combat {
	@ConfigOption(
		name = "Weapons",
		desc = ""
	)
	@ConfigEditorAccordion(id = 0)
	public boolean weaponsAccordion = false;

	@Expose
	@ConfigOption(
		name = "Disable Hyperion Particles",
		desc = "Remove the explosion effect when using a hyperion"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean disableHyperionParticles = true;

	@Expose
	@ConfigOption(
		name = "Disable Thunderlord Lightning bolt ",
		desc = "Removes the lightning bolt effect when using a thunderlord weapon"
	)
	@ConfigEditorBoolean
	@ConfigAccordionId(id = 0)
	public boolean disableThunderlordLightning = true;

}
