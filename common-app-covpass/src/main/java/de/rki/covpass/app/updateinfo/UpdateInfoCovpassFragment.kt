/*
 * (C) Copyright IBM Deutschland GmbH 2021
 * (C) Copyright IBM Corp. 2021
 */

package de.rki.covpass.app.updateinfo

import com.ibm.health.common.navigation.android.FragmentNav
import de.rki.covpass.app.R
import de.rki.covpass.commonapp.updateinfo.UpdateInfoFragment
import kotlinx.parcelize.Parcelize

@Parcelize
public class UpdateInfoCovpassFragmentNav : FragmentNav(UpdateInfoCovpassFragment::class)

public class UpdateInfoCovpassFragment : UpdateInfoFragment() {
    override val updateInfoPath: Int = R.string.update_info_path
    override val updateInfoButton: Int = R.string.vaccination_fourth_onboarding_page_button_title
}
