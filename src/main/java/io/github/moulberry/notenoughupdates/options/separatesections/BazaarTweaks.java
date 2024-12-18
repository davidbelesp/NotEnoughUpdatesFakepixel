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
import io.github.moulberry.moulconfig.annotations.ConfigAccordionId;
import io.github.moulberry.moulconfig.annotations.ConfigEditorAccordion;
import io.github.moulberry.moulconfig.annotations.ConfigEditorBoolean;
import io.github.moulberry.moulconfig.annotations.ConfigEditorInfoText;
import io.github.moulberry.moulconfig.annotations.ConfigEditorSlider;
import io.github.moulberry.moulconfig.annotations.ConfigOption;

public class BazaarTweaks {

		@ConfigOption(
			name = "\u00a7mSearch GUI",
			desc = ""
		)
		@ConfigEditorAccordion(id = 0)
		public boolean searchAccordion = false;

		@Expose
		@ConfigOption(
			name = "Enable Bazaar Search GUI",
			desc = "Use the advanced search GUI with autocomplete and history instead of the normal sign GUI\n" +
				"\u00A7cWarning: This feature is not working in Fakepixel Skyblock, no search in bazaar"
		)
		@ConfigEditorInfoText()
		@ConfigAccordionId(id = 0)
		public boolean enableSearchOverlay = false;

		@Expose
		@ConfigOption(
			name = "Keep Previous Search",
			desc = "Don't clear the search bar after closing the GUI"
		)
		@ConfigEditorBoolean
		@ConfigAccordionId(id = 0)
		public boolean keepPreviousSearch = false;

		@Expose
		@ConfigOption(
			name = "Past Searches",
			desc = "Show past searches below the autocomplete box"
		)
		@ConfigEditorBoolean
		@ConfigAccordionId(id = 0)
		public boolean showPastSearches = false;

		@Expose
		@ConfigOption(
			name = "ESC to Full Close",
			desc = "Make pressing ESCAPE close the search GUI without opening up the Bazaar again\n" +
				"ENTER can still be used to search"
		)
		@ConfigEditorBoolean
		@ConfigAccordionId(id = 0)
		public boolean escFullClose = false;

	@Expose
	@ConfigOption(
		name = "Search History Size",
		desc = "Changes how many search items get stored"
	)
	@ConfigEditorSlider(
		minValue = 1,
		maxValue = 15,
		minStep = 1
	)
	@ConfigAccordionId(id = 0)
	public int bzSearchHistorySize = 5;

	@Expose
	@ConfigOption(
		name = "Bazaar Overpay Warning",
		desc = "Warns you before you would pay more than this amount of coins for an item in the /bz"
	)
	@ConfigEditorSlider(minValue = 0, maxValue = 500_000_000, minStep = 1)
	public double bazaarOverpayWarning = 10_000_000;

	@Expose
	@ConfigOption(
		name = "CTRL+F for search",
		desc = "Open search GUI when pressing CTRL + F in the bazaar " + "\u00A7cWarning: This feature is not working in Fakepixel Skyblock, no search in bazaar"
	)
	@ConfigEditorInfoText()
	public boolean ctrlFSearch = false;
}
