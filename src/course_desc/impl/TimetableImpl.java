/**
 */
package course_desc.impl;

import course_desc.CourseWork;
import course_desc.Course_descPackage;
import course_desc.StudyProgram;
import course_desc.Timetable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timetable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course_desc.impl.TimetableImpl#getHasCourseWork <em>Has Course Work</em>}</li>
 *   <li>{@link course_desc.impl.TimetableImpl#getPrograms <em>Programs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimetableImpl extends MinimalEObjectImpl.Container implements Timetable {
	/**
	 * The cached value of the '{@link #getHasCourseWork() <em>Has Course Work</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCourseWork()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseWork> hasCourseWork;

	/**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyProgram> programs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimetableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Course_descPackage.Literals.TIMETABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseWork> getHasCourseWork() {
		if (hasCourseWork == null) {
			hasCourseWork = new EObjectContainmentEList<CourseWork>(CourseWork.class, this, Course_descPackage.TIMETABLE__HAS_COURSE_WORK);
		}
		return hasCourseWork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StudyProgram> getPrograms() {
		if (programs == null) {
			programs = new EObjectResolvingEList<StudyProgram>(StudyProgram.class, this, Course_descPackage.TIMETABLE__PROGRAMS);
		}
		return programs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Course_descPackage.TIMETABLE__HAS_COURSE_WORK:
				return ((InternalEList<?>)getHasCourseWork()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Course_descPackage.TIMETABLE__HAS_COURSE_WORK:
				return getHasCourseWork();
			case Course_descPackage.TIMETABLE__PROGRAMS:
				return getPrograms();
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
			case Course_descPackage.TIMETABLE__HAS_COURSE_WORK:
				getHasCourseWork().clear();
				getHasCourseWork().addAll((Collection<? extends CourseWork>)newValue);
				return;
			case Course_descPackage.TIMETABLE__PROGRAMS:
				getPrograms().clear();
				getPrograms().addAll((Collection<? extends StudyProgram>)newValue);
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
			case Course_descPackage.TIMETABLE__HAS_COURSE_WORK:
				getHasCourseWork().clear();
				return;
			case Course_descPackage.TIMETABLE__PROGRAMS:
				getPrograms().clear();
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
			case Course_descPackage.TIMETABLE__HAS_COURSE_WORK:
				return hasCourseWork != null && !hasCourseWork.isEmpty();
			case Course_descPackage.TIMETABLE__PROGRAMS:
				return programs != null && !programs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimetableImpl
