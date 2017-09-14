/**
 */
package course_desc.impl;

import course_desc.Course_descPackage;
import course_desc.Person;
import course_desc.PersonRole;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course_desc.impl.PersonImpl#getPersonNr <em>Person Nr</em>}</li>
 *   <li>{@link course_desc.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link course_desc.impl.PersonImpl#getHasRole <em>Has Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getPersonNr() <em>Person Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonNr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger PERSON_NR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonNr() <em>Person Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonNr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger personNr = PERSON_NR_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasRole() <em>Has Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRole()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonRole> hasRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Course_descPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getPersonNr() {
		return personNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonNr(BigInteger newPersonNr) {
		BigInteger oldPersonNr = personNr;
		personNr = newPersonNr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.PERSON__PERSON_NR, oldPersonNr, personNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonRole> getHasRole() {
		if (hasRole == null) {
			hasRole = new EObjectWithInverseResolvingEList<PersonRole>(PersonRole.class, this, Course_descPackage.PERSON__HAS_ROLE, Course_descPackage.PERSON_ROLE__LINKED_TO);
		}
		return hasRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Course_descPackage.PERSON__HAS_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasRole()).basicAdd(otherEnd, msgs);
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
			case Course_descPackage.PERSON__HAS_ROLE:
				return ((InternalEList<?>)getHasRole()).basicRemove(otherEnd, msgs);
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
			case Course_descPackage.PERSON__PERSON_NR:
				return getPersonNr();
			case Course_descPackage.PERSON__NAME:
				return getName();
			case Course_descPackage.PERSON__HAS_ROLE:
				return getHasRole();
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
			case Course_descPackage.PERSON__PERSON_NR:
				setPersonNr((BigInteger)newValue);
				return;
			case Course_descPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case Course_descPackage.PERSON__HAS_ROLE:
				getHasRole().clear();
				getHasRole().addAll((Collection<? extends PersonRole>)newValue);
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
			case Course_descPackage.PERSON__PERSON_NR:
				setPersonNr(PERSON_NR_EDEFAULT);
				return;
			case Course_descPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Course_descPackage.PERSON__HAS_ROLE:
				getHasRole().clear();
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
			case Course_descPackage.PERSON__PERSON_NR:
				return PERSON_NR_EDEFAULT == null ? personNr != null : !PERSON_NR_EDEFAULT.equals(personNr);
			case Course_descPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Course_descPackage.PERSON__HAS_ROLE:
				return hasRole != null && !hasRole.isEmpty();
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
		result.append(" (personNr: ");
		result.append(personNr);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
