/**
 */
package course_desc.impl;

import course_desc.Course;
import course_desc.Course_descPackage;
import course_desc.Department;
import course_desc.StudyProgram;
import course_desc.StudyProgramCode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course_desc.impl.StudyProgramImpl#getStudyCode <em>Study Code</em>}</li>
 *   <li>{@link course_desc.impl.StudyProgramImpl#getOffers <em>Offers</em>}</li>
 *   <li>{@link course_desc.impl.StudyProgramImpl#getBelongs <em>Belongs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyProgramImpl extends MinimalEObjectImpl.Container implements StudyProgram {
	/**
	 * The default value of the '{@link #getStudyCode() <em>Study Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyCode()
	 * @generated
	 * @ordered
	 */
	protected static final StudyProgramCode STUDY_CODE_EDEFAULT = StudyProgramCode.MTDT;

	/**
	 * The cached value of the '{@link #getStudyCode() <em>Study Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyCode()
	 * @generated
	 * @ordered
	 */
	protected StudyProgramCode studyCode = STUDY_CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOffers() <em>Offers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffers()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> offers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Course_descPackage.Literals.STUDY_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyProgramCode getStudyCode() {
		return studyCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyCode(StudyProgramCode newStudyCode) {
		StudyProgramCode oldStudyCode = studyCode;
		studyCode = newStudyCode == null ? STUDY_CODE_EDEFAULT : newStudyCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.STUDY_PROGRAM__STUDY_CODE, oldStudyCode, studyCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getOffers() {
		if (offers == null) {
			offers = new EObjectResolvingEList<Course>(Course.class, this, Course_descPackage.STUDY_PROGRAM__OFFERS);
		}
		return offers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Department getBelongs() {
		if (eContainerFeatureID() != Course_descPackage.STUDY_PROGRAM__BELONGS) return null;
		return (Department)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelongs(Department newBelongs, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBelongs, Course_descPackage.STUDY_PROGRAM__BELONGS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongs(Department newBelongs) {
		if (newBelongs != eInternalContainer() || (eContainerFeatureID() != Course_descPackage.STUDY_PROGRAM__BELONGS && newBelongs != null)) {
			if (EcoreUtil.isAncestor(this, newBelongs))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBelongs != null)
				msgs = ((InternalEObject)newBelongs).eInverseAdd(this, Course_descPackage.DEPARTMENT__MANAGES, Department.class, msgs);
			msgs = basicSetBelongs(newBelongs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.STUDY_PROGRAM__BELONGS, newBelongs, newBelongs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Course_descPackage.STUDY_PROGRAM__BELONGS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBelongs((Department)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Course_descPackage.STUDY_PROGRAM__BELONGS:
				return basicSetBelongs(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Course_descPackage.STUDY_PROGRAM__BELONGS:
				return eInternalContainer().eInverseRemove(this, Course_descPackage.DEPARTMENT__MANAGES, Department.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Course_descPackage.STUDY_PROGRAM__STUDY_CODE:
				return getStudyCode();
			case Course_descPackage.STUDY_PROGRAM__OFFERS:
				return getOffers();
			case Course_descPackage.STUDY_PROGRAM__BELONGS:
				return getBelongs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Course_descPackage.STUDY_PROGRAM__STUDY_CODE:
				setStudyCode((StudyProgramCode)newValue);
				return;
			case Course_descPackage.STUDY_PROGRAM__OFFERS:
				getOffers().clear();
				getOffers().addAll((Collection<? extends Course>)newValue);
				return;
			case Course_descPackage.STUDY_PROGRAM__BELONGS:
				setBelongs((Department)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Course_descPackage.STUDY_PROGRAM__STUDY_CODE:
				setStudyCode(STUDY_CODE_EDEFAULT);
				return;
			case Course_descPackage.STUDY_PROGRAM__OFFERS:
				getOffers().clear();
				return;
			case Course_descPackage.STUDY_PROGRAM__BELONGS:
				setBelongs((Department)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Course_descPackage.STUDY_PROGRAM__STUDY_CODE:
				return studyCode != STUDY_CODE_EDEFAULT;
			case Course_descPackage.STUDY_PROGRAM__OFFERS:
				return offers != null && !offers.isEmpty();
			case Course_descPackage.STUDY_PROGRAM__BELONGS:
				return getBelongs() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (studyCode: ");
		result.append(studyCode);
		result.append(')');
		return result.toString();
	}

} //StudyProgramImpl
